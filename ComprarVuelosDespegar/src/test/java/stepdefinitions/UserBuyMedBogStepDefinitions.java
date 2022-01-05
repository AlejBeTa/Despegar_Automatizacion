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
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import utils.drivers.MyChromeDriver;


import static org.hamcrest.Matchers.*;
import static utils.constants.Constants.URL_DESPEGAR;


public class UserBuyMedBogStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Alejandro");
    }

    @Given("^that the user enter to the page$")
    public void thatTheUserEnterToThePage(){ OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.inicializarNavegador().onUrl(URL_DESPEGAR) ));}
}
