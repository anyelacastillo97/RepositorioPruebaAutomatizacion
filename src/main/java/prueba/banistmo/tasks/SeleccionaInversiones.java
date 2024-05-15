package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static prueba.banistmo.userinterfaces.HomePage.BOTON_INVERSIONES;

public class SeleccionaInversiones implements Task {
    
    @Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_INVERSIONES));
	}

	public static SeleccionaInversiones seleccionar() {
		return instrumented(SeleccionaInversiones.class);
	}

}
