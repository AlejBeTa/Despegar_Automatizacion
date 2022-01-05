package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.HomePage.TXT_SECMONTH;

public class ValidateSecondMonth implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return TXT_SECMONTH.resolveFor(actor).getText();
    }

    public static ValidateSecondMonth text(){ return new ValidateSecondMonth();}
}
