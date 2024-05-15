package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static prueba.banistmo.userinterfaces.HomePage.BOTON_PRODUCTOS_SERVICIOS;

public class SeleccionaProductosServicios implements Task {
    
    @Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_PRODUCTOS_SERVICIOS));
	}

	public static SeleccionaProductosServicios seleccionar() {
		return instrumented(SeleccionaProductosServicios.class);
	}

}
