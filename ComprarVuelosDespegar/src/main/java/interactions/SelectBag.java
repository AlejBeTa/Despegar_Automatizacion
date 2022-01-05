package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.Flights.ACCEPT_BAG;
import static utils.constants.Constants.SESENTA;

public class SelectBag implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(ACCEPT_BAG, WebElementStateMatchers.isClickable()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(ACCEPT_BAG));
    }

    public static SelectBag accept(){return instrumented(SelectBag.class);}
}
