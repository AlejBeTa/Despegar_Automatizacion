package task;

import models.FlightInformation;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import java.util.List;

import static userinterfaces.HomePage.INPUT_FROM;
import static userinterfaces.HomePage.INPUT_TO;


public class EnterFlightInformation implements Task {
    private List<FlightInformation> flightinformation;

    public EnterFlightInformation(List<FlightInformation> flightinformation){ this.flightinformation = flightinformation;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(INPUT_FROM, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds();
        actor.attemptsTo(Enter.theValue(flightinformation.get(0).getFrom()).into(INPUT_FROM));
        actor.attemptsTo(Enter.theValue(flightinformation.get(0).getTo()).into(INPUT_TO));

    }

    public static EnterFlightInformation withTheInfo(List<FlightInformation> flightinformation){ return Tasks.instrumented(EnterFlightInformation.class, flightinformation);}
}
