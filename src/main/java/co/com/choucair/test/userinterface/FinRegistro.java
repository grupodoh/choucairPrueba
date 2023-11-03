package co.com.choucair.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinRegistro extends PageObject {

    public static final Target PASSWORD_FIN = Target.the("Campo de texto para registrar la contraseña").located(By.id("password"));
    public static final Target PASSWORD2_FIN = Target.the("Campo de texto para registrar  la Confirmacion de contraseña").located(By.id("confirmPassword"));
    public static final Target MANTENTE_INFORMADO = Target.the("Check para confirmar que desea estar informado por correo de las novedades.").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target ACEPTA_TERMINOS = Target.the("Check que confirma que ha leido y acepta los terminos de uso de uTest").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACEPTA_POLITICAS = Target.the("Check que confirma que ha leido y acepta la política de privacidad y seguridad de uTest").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_FIN_CONFIGURACION = Target.the("Botón para finalizar el registro de usuario o la configuración del usuario").located(By.id("laddaBtn"));

}
