package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.serenitybdd.screenplay.questions.Text;
import java.text.Normalizer;

import java.util.Set;

import prueba.banistmo.userinterfaces.InversionVirtualPage;
import prueba.banistmo.userinterfaces.DocumentoPage;
import static prueba.banistmo.userinterfaces.InversionVirtualPage.BOTON_DOCUMENTOS;
import static prueba.banistmo.userinterfaces.InversionVirtualPage.BOTON_REGLAMENTO;
import static prueba.banistmo.userinterfaces.DocumentoPage.BOTON_TITULO;

public class ValidaDocumento implements Task {
    
    private static final Logger logger = LoggerFactory.getLogger(ValidaDocumento.class);

    @Override
	public <T extends Actor> void performAs(T actor) {
        String nombrePDF = Text.of(BOTON_REGLAMENTO).viewedBy(actor).asString();
        logger.info("Nombre pestaña: " +nombrePDF);
        // Comparar el título de la tercera pestaña con el título esperado
        String nombreEsperado = "Reglamento Inversi[o]n Virtual Bancolombia";
        String textoNormalizadoCapturado = Normalizer.normalize(nombrePDF, Normalizer.Form.NFD)
        .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        Assert.assertEquals("El texto capturado no coincide con el esperado", nombreEsperado, textoNormalizadoCapturado);
	}

	public static ValidaDocumento seleccionar() {
		return instrumented(ValidaDocumento.class);
	}

}
