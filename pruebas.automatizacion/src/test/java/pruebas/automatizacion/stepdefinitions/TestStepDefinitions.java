package pruebas.automatizacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebas.automatizacion.questions.Answer;
import pruebas.automatizacion.tasks.Login;
import pruebas.automatizacion.tasks.OpenUp;
import pruebas.automatizacion.tasks.Search;


public class TestStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Juan quiere aprender a ser un tester automatizador$")
    public void juanQuiereAprenderASerUnTesterAutomatizador() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }


    @When("^Buscar el curso (.*) en el sitio web$")
    public void buscarElCursoIntroductionToGamblingTestingEnElSitioWeb(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^Elegir el curso (.*)$")
    public void elegirElCursoIntroductionToGamblingTesting(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }


}
