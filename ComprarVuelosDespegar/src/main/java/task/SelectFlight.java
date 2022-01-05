package task;

import interactions.SelectBag;
import interactions.SelectFirstFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFirstFlight.select());
        actor.attemptsTo(SelectBag.accept());
    }

    public static SelectFlight select(){ return instrumented(SelectFlight.class);}
}
