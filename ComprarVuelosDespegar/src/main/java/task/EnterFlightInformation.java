package task;


import interactions.SelectCity;
import interactions.SelectDate;
import interactions.Type;
import models.FlightInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;


public class EnterFlightInformation implements Task {
    private List<FlightInformation> flightinformation;

    public EnterFlightInformation(List<FlightInformation> flightinformation){ this.flightinformation = flightinformation;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SelectCity.withCitys(flightinformation.get(0).getFrom(),flightinformation.get(0).getTo()));
        actor.attemptsTo(SelectDate.withDates(flightinformation.get(0).getGoDate(),flightinformation.get(0).getBackDate()));


    }

    public static EnterFlightInformation withTheInfo(List<FlightInformation> flightinformation){ return instrumented(EnterFlightInformation.class, flightinformation);}
}
