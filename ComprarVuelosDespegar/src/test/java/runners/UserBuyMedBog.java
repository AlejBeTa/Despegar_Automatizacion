package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "ComprarVuelosDespegar\\src\\test\\resources\\features\\user_buy_med_bog.feature",
                glue = "stepdefinitions",
                snippets = SnippetType.CAMELCASE)

public class UserBuyMedBog {
}
