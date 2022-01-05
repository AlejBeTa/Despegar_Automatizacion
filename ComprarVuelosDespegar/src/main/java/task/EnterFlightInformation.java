package task;

import interactions.FindMonth;
import interactions.SelectDate;
import interactions.Type;
import models.FlightInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterfaces.HomePage.*;


public class EnterFlightInformation implements Task {
    private List<FlightInformation> flightinformation;

    public EnterFlightInformation(List<FlightInformation> flightinformation){ this.flightinformation = flightinformation;}

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Type.information(flightinformation.get(0).getFrom(),INPUT_FROM));
        actor.attemptsTo(Type.information(flightinformation.get(0).getTo(),INPUT_TO));
        actor.attemptsTo(SelectDate.withDates(flightinformation.get(0).getGoDate(),flightinformation.get(0).getBackDate()));


    }

    public static EnterFlightInformation withTheInfo(List<FlightInformation> flightinformation){ return Tasks.instrumented(EnterFlightInformation.class, flightinformation);}
}
