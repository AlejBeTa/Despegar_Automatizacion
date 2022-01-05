package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterfaces.HomePage.NEXTMONTH_ARROW;
import static utils.constants.Constants.SESENTA;

public class NextMonth implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(NEXTMONTH_ARROW, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(NEXTMONTH_ARROW));
    }

    public static NextMonth click(){ return Tasks.instrumented(NextMonth.class);
    }
}
