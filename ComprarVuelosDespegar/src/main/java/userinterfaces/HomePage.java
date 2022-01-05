package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static utils.constants.Constants.BASE_DAY;

public class HomePage {

    public static final Target INPUT_FROM = Target.the("Origen").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input"));
    public static final Target INPUT_TO = Target.the("Destino").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input"));
    public static final Target INPUT_GODATE = Target.the("Fecha de ida").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input"));
    public static final Target INPUT_BACKDATE = Target.the("Fecha de regreso").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div/input"));
    public static final Target TXT_FIRSTMONTH = Target.the("Nombre del primer mes").located(By.xpath("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
    public static final Target TXT_SECMONTH = Target.the("Nombre del segundo mes").located(By.xpath("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
    public static final Target NEXTMONTH_ARROW = Target.the("Flecha de siguientes meses").located(By.xpath("//*[@id='component-modals']/div[1]/div[1]/div[2]/a[2]"));
    public static  Target TXT_DAY;
    public static final Target APPLY_DATE = Target.the("Boton para aplicar fechas").located(By.xpath("//*[@id='component-modals']/div[1]/div[2]/div[1]/button/em"));
    public static final Target SEARCH_BUTTON = Target.the("Boton buscar vuelos").located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div[2]/div[3]/button/em"));

    public static void DAY(String day){
        TXT_DAY=Target.the("Día").located(By.xpath(BASE_DAY+day+"]"));
    }

}
