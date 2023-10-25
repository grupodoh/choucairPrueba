package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDireccion {

    public static  final Target CIUDAD = Target.the("Ciudad").located(By.id("city"));
    public static  final Target CODIGO_POSTAL = Target.the("Codigo postal").located(By.id("zip"));
    public static  final Target PAIS = Target.the("Pais").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public  static final Target CAJA_DE_PAISES = Target.the("Caja para selecionar el pais").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public  static final  Target BOTOB_CONTINUAR_DISPOSITIVOS = Target.the("Dispositivos").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

}
