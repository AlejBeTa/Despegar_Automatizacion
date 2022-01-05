package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.Flights.FIRST_FLIGHT;
import static utils.constants.Constants.SESENTA;

public class SelectFirstFlight implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(FIRST_FLIGHT, WebElementStateMatchers.isClickable()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(FIRST_FLIGHT));
    }

    public static SelectFirstFlight select(){ return instrumented( SelectFirstFlight.class);}
}
