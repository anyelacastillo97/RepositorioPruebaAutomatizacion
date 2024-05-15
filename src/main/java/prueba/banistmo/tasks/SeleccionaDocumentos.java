package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

import prueba.banistmo.userinterfaces.InversionVirtualPage;
import static prueba.banistmo.userinterfaces.InversionVirtualPage.BOTON_DOCUMENTOS;
import static prueba.banistmo.userinterfaces.InversionVirtualPage.BOTON_REGLAMENTO;

public class SeleccionaDocumentos implements Task {
    
    @Override
	public <T extends Actor> void performAs(T actor) {
		// Capturar identificador de las pestana abiertas antes de la acción        
        String pestanaPrincipal = actor.usingAbilityTo(BrowseTheWeb.class).getDriver().getWindowHandle();
        actor.attemptsTo(
            Click.on(BOTON_DOCUMENTOS),
            Click.on(BOTON_REGLAMENTO)
        );
        
    }

	public static SeleccionaDocumentos seleccionar() {
		return instrumented(SeleccionaDocumentos.class);
	}

}
