package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDispositivos {

    public static final Target SO_PC = Target.the("Sistema operativo del pc").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public static final Target VERSION_SO = Target.the("Version del sistema operativo").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final  Target IDIOMA_SO = Target.the("Idioma que maneja en el pc").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target DISPOSITIVO_MOVIL = Target.the("marca del dispositivo").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target MODELO = Target.the("Version del dispositivo").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final  Target VERSION_SO_MOVIL = Target.the("Sistema operativo del dispositivo").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target BOTON_CONTINUAR_ULTIMA_FASE = Target.the("Boton para ir a la ultima página").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}