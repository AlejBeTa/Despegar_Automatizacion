package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target INPUT_FROM = Target.the("Origen").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input"));
    public static final Target INPUT_TO = Target.the("Destino").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input"));

}
