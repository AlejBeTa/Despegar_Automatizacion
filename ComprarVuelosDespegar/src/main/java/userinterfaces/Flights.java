package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Flights {

    public static final Target FIRST_FLIGHT = Target.the("Primer vuelo").located(By.xpath("//*[@id='clusters']/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]/buy-button/a/div/em"));
    public static final Target ACCEPT_BAG = Target.the("Aceptar el equipaje").located(By.xpath("//*[@id='upselling-popup-position']/upselling-popup/div/div[3]/div/div/button/em"));
}
