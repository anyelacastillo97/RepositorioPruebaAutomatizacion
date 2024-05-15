package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import prueba.banistmo.userinterfaces.InversionesPage;
import static prueba.banistmo.userinterfaces.InversionesPage.BOTON_INVERSION_VIRTUAL;

public class SeleccionaInversionVirtual implements Task {
    
    @Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_INVERSION_VIRTUAL));

		// Cambiar al controlador de la nueva pestana
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		String pestanaPrincipal = driver.getWindowHandle();
		    for (String pestana : driver.getWindowHandles()) {
				if (!pestana.equals(pestanaPrincipal)) { 
	               	driver.switchTo().window(pestana);
        	        break;             
			}         
		}
	}

	public static SeleccionaInversionVirtual seleccionar() {
		return instrumented(SeleccionaInversionVirtual.class);
	}

}
