package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;



import static java.lang.Boolean.TRUE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;
import static utils.constants.Constants.SESENTA;

public class FindMonth implements Interaction {
    private String date;
    private String month;
    private String day;

    public FindMonth(String date){this.date = date; this.month = this.date.split(" ")[0]; this.day = this.date.split(" ")[1];}

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(TXT_FIRSTMONTH, WebElementStateMatchers.isVisible()).forNoMoreThan(SESENTA).seconds();
        while(TRUE){
            if (TXT_FIRSTMONTH.resolveFor(actor).getText().equals(month)){
                actor.attemptsTo(SelectDay.day(day));
                break;
            }
            else{
                actor.attemptsTo(NextMonth.click());
            }

        }

    }
    public static FindMonth find(String date){
        return instrumented(FindMonth.class, date);

    }
}
