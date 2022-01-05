package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.FlightInformation;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import task.EnterFlightInformation;
import task.SearchFlight;
import task.SelectFlight;
import utils.drivers.MyChromeDriver;


import java.util.List;

import static utils.constants.Constants.URL_DESPEGAR;


public class UserBuyMedBogStepDefinitions {

    @Managed
    MyChromeDriver BROWSER = MyChromeDriver.inicializarNavegador();

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Alejandro");

    }

    @Given("^that the user enter to the page$")
    public void thatTheUserEnterToThePage(){ OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(BROWSER.onUrl(URL_DESPEGAR) ));}

    @And("^type all the data$")
    public void typeAllTheData(List<FlightInformation> flightinformation){
        OnStage.theActorInTheSpotlight().wasAbleTo(EnterFlightInformation.withTheInfo(flightinformation));
    }

    @When("^the user search flight$")
    public void theUserSearchFlight(){
        OnStage.theActorInTheSpotlight().wasAbleTo(SearchFlight.search());
    }

    @And("^select the first result$")
    public void selectTheFirstResult(){
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectFlight.select());
    }
}