package prueba.banistmo.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;
import java.util.Set;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Click;


public class InversionesPage extends PageObject {
    public static final Target BOTON_INVERSION_VIRTUAL = Target.the("Boton inversion virtual").locatedBy("//div[@class='col-xs-12 contenido']/h2/a[@href='/personas/productos-servicios/inversiones/inversion-virtual/']");

    public Target botonInversionVirtual() {
        return BOTON_INVERSION_VIRTUAL;
    }
}