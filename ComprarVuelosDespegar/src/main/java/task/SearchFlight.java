package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.SEARCH_BUTTON;

public class SearchFlight implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SEARCH_BUTTON));
    }

    public static SearchFlight search(){ return instrumented(SearchFlight.class);}
}
