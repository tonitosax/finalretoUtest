package co.com.choucair.certification.retoUtest.stepdefinitions;

import co.com.choucair.certification.retoUtest.model.retoUtestData;
import co.com.choucair.certification.retoUtest.questions.Answer;
import co.com.choucair.certification.retoUtest.tasks.Fill;
import co.com.choucair.certification.retoUtest.tasks.JoinToday;
import co.com.choucair.certification.retoUtest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class retoUtestStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than Brandon wants to join to page Utest$")
    public void thanBrandonWantsToJoinToPageUtest() throws Exception {
        theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^He fill all forms$")
    public void heFillAllForms(List<retoUtestData> retoutestdata) throws Exception {
        theActorInTheSpotlight().attemptsTo(Fill.theForms(retoutestdata));
    }

    @Then("^He can view the Utest welcome Page$")
    public void heCanViewTheUtestWelcomePage(List<retoUtestData> retoutestdata) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(retoutestdata)));
    }

}
