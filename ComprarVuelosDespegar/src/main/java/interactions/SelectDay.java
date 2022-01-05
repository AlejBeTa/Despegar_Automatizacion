package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.TXT_DAY;
import static utils.constants.Constants.SESENTA;

public class SelectDay implements Interaction {

    private String day;

    public SelectDay(String day){ this.day = day;}
    @Override
    public <T extends Actor> void performAs(T actor) {

        HomePage.DAY(day);
        WaitUntil.the(TXT_DAY, WebElementStateMatchers.isClickable()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(TXT_DAY));

    }

    public static SelectDay day(String day){ return instrumented(SelectDay.class, day);}
}
