package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinRegistro {

    public static final Target PASSWORD_FIN = Target.the("contraseña").located(By.id("password"));
    public static final Target PASSWORD2_FIN = Target.the("Confirmacion de contraseña").located(By.id("confirmPassword"));
    public static final Target MANTENTE_INFORMADO = Target.the("Confirmacion de contraseña").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target ACEPTA_TERMINOS = Target.the("Confirmacion de contraseña").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACEPTA_POLITICAS = Target.the("Confirmacion de contraseña").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_FIN_CONFIGURACION = Target.the("Confirmacion de contraseña").located(By.id("laddaBtn"));

}
