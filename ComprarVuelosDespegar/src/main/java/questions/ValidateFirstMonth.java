package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.HomePage.TXT_FIRSTMONTH;

public class ValidateFirstMonth implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return TXT_FIRSTMONTH.resolveFor(actor).getText();
    }

    public static ValidateFirstMonth text(){ return new ValidateFirstMonth();}
}
