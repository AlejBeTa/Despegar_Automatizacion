package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;
import static utils.constants.Constants.SESENTA;

public class SelectCity implements Interaction {

    private String cityOrigin;
    private String cityDestiny;

    public SelectCity(String cityOrigin, String cityDestiny){ this.cityOrigin=cityOrigin; this.cityDestiny=cityDestiny;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(INPUT_FROM));
        actor.attemptsTo(Type.information(cityOrigin,INPUT_FROM));
        WaitUntil.the(ORIGINCITY_LIST, WebElementStateMatchers.isClickable()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(ORIGINCITY_LIST));
        actor.attemptsTo(Click.on(INPUT_TO));
        actor.attemptsTo(Type.information(cityDestiny,INPUT_TO));
        WaitUntil.the(DESTINYCITY_LIST, WebElementStateMatchers.isClickable()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Click.on(DESTINYCITY_LIST));


    }

    public static SelectCity withCitys(String cityOrigin, String cityDestiny){ return instrumented(SelectCity.class, cityOrigin, cityDestiny);}
}
