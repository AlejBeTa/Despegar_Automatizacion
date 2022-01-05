package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;
import static utils.constants.Constants.SESENTA;

public class SelectDate implements Interaction {
    private String goDate;
    private String backDate;

    public SelectDate(String goDate, String backDate){ this.goDate = goDate; this.backDate = backDate;}
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(INPUT_GODATE));
        actor.attemptsTo(FindMonth.find(goDate));
        actor.attemptsTo(Click.on(INPUT_BACKDATE));
        actor.attemptsTo(FindMonth.find(backDate));
        WaitUntil.the(APPLY_DATE, WebElementStateMatchers.isClickable()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(APPLY_DATE));

    }

    public static SelectDate withDates(String goDate, String backDate){ return instrumented(SelectDate.class, goDate, backDate);}
}
