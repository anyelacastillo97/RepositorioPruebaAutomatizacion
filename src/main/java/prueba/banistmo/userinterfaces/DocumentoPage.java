package prueba.banistmo.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;
import java.util.Set;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Click;


public class DocumentoPage extends PageObject {
    public static final Target BOTON_TITULO = Target.the("Boton titulo").locatedBy("//html/body/div[1]/div/div/div[1]/div/div/div/div[1]/nav/div[4]/div[2]/div/span/button/div[3]");
   
}