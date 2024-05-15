package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.screenplay.waits.Wait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import prueba.banistmo.tasks.SeleccionaProductosServicios;
import prueba.banistmo.tasks.SeleccionaInversiones;
import prueba.banistmo.tasks.SeleccionaInversionVirtual;
import prueba.banistmo.tasks.SeleccionaDocumentos;
import prueba.banistmo.tasks.ValidaDocumento;
import prueba.banistmo.userinterfaces.InversionesPage;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.screenplay.actions.Click;

import org.openqa.selenium.chrome.ChromeDriver;

import prueba.banistmo.userinterfaces.HomePage;

public class BanistmoStep {
    
    @Managed(driver = "chrome")
	private WebDriver navegador;
	private Actor actor= Actor.named("Bancolombia");
	private HomePage homePage= new HomePage();

    @Given("^que un usuario esta en la pagina de Bancolombia Personas$")
	public void queUnUsuarioEstaEnLaPaginaDeBancolombiaPersonas() {
        //WebDriver driver = new ChromeDriver();
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^selecciona la opcion productos y servicios$")
    public void seleccionaProductosYServicios() {
        actor.wasAbleTo(SeleccionaProductosServicios.seleccionar());
    }

    @When("^selecciona la opcion inversiones$")
    public void seleccionaLaOpcionInversiones() {
        actor.wasAbleTo(SeleccionaInversiones.seleccionar());
    }

	@When("^selecciona la opcion inversion virtual$")
    public void seleccionaLaOpcionInversionVirtual() {
        actor.wasAbleTo(SeleccionaInversionVirtual.seleccionar());
    }	

	@When("^selecciona el boton documentos$")
    public void seleccionaElBotonDocumentos() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
		actor.wasAbleTo(SeleccionaDocumentos.seleccionar());
    }

    @Then("^valida que el documento sea correcto$")
    public void validaQueElDocumentoSeaCorrecto() throws InterruptedException {
		Thread.sleep(TimeUnit.SECONDS.toMillis(5));
    	actor.wasAbleTo(ValidaDocumento.seleccionar());
    }

}