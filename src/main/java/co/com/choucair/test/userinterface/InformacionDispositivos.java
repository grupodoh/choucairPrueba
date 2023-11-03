package co.com.choucair.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDispositivos extends PageObject {

    public static final Target SO_PC_CONT = Target.the("Campo de texto para registrar el Sistema operativo del pc").located(By.cssSelector("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SO_PC_TEXTO = Target.the("Contenedor para registrar el Sistema operativo del pc").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target VERSION_SO_CONT = Target.the("Campo de texto para registrar la Version del sistema operativo del pc").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]"));
    public static final Target VERSION_SO_TEXTO = Target.the("Contenedor que muestra las Versiones de sistema operativo").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final  Target IDIOMA_SO_CONT = Target.the("Campo de texto para registrar el Idioma que maneja en el sistema operativo").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]"));
    public static final  Target IDIOMA_SO_TEXTO = Target.the("Contenedor que muestra el Idioma que maneja en el sistema operativo").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target DISPOSITIVO_MOVIL_CONT = Target.the("Contenedor para registrar la marca del dispositivo movil").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target DISPOSITIVO_MOVIL_INPUT = Target.the("Campo de texto para registrar la marca del dispositivo movil").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target DISPOSITIVO_MOVIL_TEXTO = Target.the("Contenedor que muestra las marcas de los dispositivos").located(By.xpath("//*[@id='ui-select-choices-row-12-0']"));
    public static final Target MODELO_CONT = Target.the("Contenedor para registrar el modelo del dispositivo movil").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target MODEL_INPUT = Target.the("Campo de texto para ingresar el modelo del dispositivo movil").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target MODELO_TEXTO = Target.the("Contenedor que muestra los modelos de los dispositivos moviles").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final  Target VERSION_SO_MOVIL_CONT = Target.the("Contenedor para registrar la version del  Sistema operativo del dispositivo movil").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]"));
    public static final  Target VERSION_SO_MOVIL_INPUT = Target.the("Campo de texto para ingresar la version del Sistema Operativo movil").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final  Target VERSION_SO_MOVIL_TEXT = Target.the("Contenedor que muestra las versiones del Sistema operativo del dispositivo movil").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span/span[2]"));

    public static final Target BOTON_CONTINUAR_ULTIMA_FASE = Target.the("Botón para ir a la ultima página del registro de usurios").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}
