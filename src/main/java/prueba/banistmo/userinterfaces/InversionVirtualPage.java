package prueba.banistmo.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;
import java.util.Set;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Click;


public class InversionVirtualPage extends PageObject {
    public static final Target BOTON_DOCUMENTOS = Target.the("Boton documentos").located(By.cssSelector("a[href='#tab4']"));
    public static final Target BOTON_REGLAMENTO = Target.the("Boton reglamento iv").located(By.xpath("//div[@id='tab4']/button/a"));

}