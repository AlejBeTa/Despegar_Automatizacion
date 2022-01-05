package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static utils.constants.Constants.SESENTA;

public class Type implements Interaction {

    private String info;
    private Target target;

    public Type (String info, Target target){
        this.info = info; this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(target, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        actor.attemptsTo(Enter.theValue(info).into(target));
    }

    public static Type information(String info, Target target){
        return instrumented(Type.class,info,target);
    }
}
