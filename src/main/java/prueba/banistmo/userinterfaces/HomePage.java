package prueba.banistmo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bancolombia.com/personas")
public class HomePage extends PageObject{
	public static final Target BOTON_PRODUCTOS_SERVICIOS = Target.the("Boton productos y servicios").located(By.id("menu-productos"));
	public static final Target BOTON_INVERSIONES = Target.the("Boton inversiones").located(By.id("header-productos-inversiones"));
		
}
