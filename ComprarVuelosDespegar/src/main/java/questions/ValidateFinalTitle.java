package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterfaces.FinalPage.TXT_TITLE;
import static utils.constants.Constants.SESENTA;

public class ValidateFinalTitle implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(TXT_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        return TXT_TITLE.resolveFor(actor).getText();
    }

    public static ValidateFinalTitle Texto(){ return new ValidateFinalTitle();}
}
