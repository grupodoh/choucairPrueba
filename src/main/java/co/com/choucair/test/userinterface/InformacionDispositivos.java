package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDispositivos {

    public static final Target SO_PC_CONT = Target.the("Sistema operativo del pc").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]"));
    public static final Target SO_PC_TEXTO = Target.the("Sistema operativo del pc").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target VERSION_SO_CONT = Target.the("Version del sistema operativo").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]"));
    public static final Target VERSION_SO_TEXTO = Target.the("Version del sistema operativo").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final  Target IDIOMA_SO_CONT = Target.the("Idioma que maneja en el pc").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]"));
    public static final  Target IDIOMA_SO_TEXTO = Target.the("Idioma que maneja en el pc").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target DISPOSITIVO_MOVIL_CONT = Target.the("marca del dispositivo").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]"));
    public static final Target DISPOSITIVO_MOVIL_TEXTO = Target.the("marca del dispositivo").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target MODELO_CONT = Target.the("Version del dispositivo").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]"));
    public static final Target MODELO_TEXTO = Target.the("Version del dispositivo").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final  Target VERSION_SO_MOVIL_CONT = Target.the("Sistema operativo del dispositivo").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]"));
    public static final  Target VERSION_SO_MOVIL_TEXT = Target.the("Sistema operativo del dispositivo").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target BOTON_CONTINUAR_ULTIMA_FASE = Target.the("Boton para ir a la ultima página").located(By.xpath("//div[@class='pull-right next-step']"));
}
