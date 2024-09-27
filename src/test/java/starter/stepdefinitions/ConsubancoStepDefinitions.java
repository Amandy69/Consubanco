package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.tasks.*;
import starter.ui.CotizarPage;
import starter.ui.HomePage;
import starter.questions.QuesGetText;
import static org.hamcrest.CoreMatchers.containsString;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ConsubancoStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {OnStage.setTheStage(new OnlineCast());}

    @Given("que el cliente abre el apk")
    public void queElclienteAbreElApk() {
        theActorCalled("cliente").attemptsTo(
            NavigateTo.login()
        );
    }

    @When("ingresamos usuario y contrasena")
    public void ingresamosUsuarioYContrasena() {
        theActorInTheSpotlight().attemptsTo(
                Login.credenciales("0010007424","Promotor1")
        );
    }

    @And("damos clic en Ingresar")
    public void damosClicEnIngresar() {
        theActorInTheSpotlight().attemptsTo(
                new Login()
        );
    }

    @Then("sistema mostrará la pantalla inicial con la opción “Nueva Solicitud”")
    public void sistemaMostraraLaPantallaInicialConLaOpcionNuevaSolicitud() {
        theActorInTheSpotlight().should(
                seeThat("label_nuevaSolicitud",QuesGetText.getText(CotizarPage.label_nuevaSolicitud), containsString("Nueva Solicitud"))
        );
    }

    @Given("que estamos en el formulario {string}")
    public void que_estamos_en_el_formulario(String string) {
        theActorInTheSpotlight().attemptsTo(
                Cotizar.Solicitud()
        );
    }

    @When("cuando llenamos los campos del formulario")
    public void cuandoLlenamosLosCamposDelFormulario() {
        theActorInTheSpotlight().attemptsTo(
                LlenarNuevaSolicitud.Llenar()
        );
    }

    @Then("sistema permite ingresar el monto")
    public void sistemaPermiteIngresarElMonto() {
        theActorInTheSpotlight().should(
                seeThat("label_nuevaSolicitud",QuesGetText.getText(CotizarPage.label_nuevaSolicitud), containsString("Nueva Solicitud"))
        );
    }

    @Given("ingresa el {string}")
    public void ingresa_el(String string) {
        theActorInTheSpotlight().attemptsTo(
                Cotizar.Solicitud()
        );
    }

    @When("da clic en el boton {string}")
    public void da_clic_en_el_boton(String string) {
        theActorInTheSpotlight().attemptsTo(
                Cotizar.Solicitud()
        );
    }

    @Then("redirecciona a la pantalla de “Resultados de cotizaciones”")
    public void RedireccionaALaPantallaDeResultadosDeCotizacione() {
        theActorInTheSpotlight().should(
                seeThat("label_nuevaSolicitud",QuesGetText.getText(CotizarPage.label_nuevaSolicitud), containsString("Nueva Solicitud"))
        );
    }


}
