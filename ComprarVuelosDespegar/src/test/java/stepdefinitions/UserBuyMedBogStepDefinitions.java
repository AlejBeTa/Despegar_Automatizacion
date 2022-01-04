package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;


public class UserBuyMedBogStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(theirBrowser)));
        OnStage.theActorCalled("Alejandro");
    }

    @Managed
    private WebDriver theirBrowser;

    @Given("^that the user enter to the page$")
    public void thatTheUserEnterToThePage(){ OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.despegar.com.co/"));}
}
