package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage {

    public static final Target TXT_TITLE = Target.the("Titulo de la pagina final").located(By.xpath("//*[@id='checkout-content']/div[1]/h2"));
}
