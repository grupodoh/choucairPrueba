package co.com.choucair.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDireccion extends PageObject {

    public static  final Target CIUDAD = Target.the("Campo de texto para registrar la Ciudad").located(By.id("city"));
    public static  final Target CODIGO_POSTAL = Target.the("Campo de texto para registrar el Codigo postal").located(By.id("zip"));
    public static  final Target PAIS = Target.the("Campo de texto para registrar el Pais").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group-box > div.row > div.col-xs-12.col-sm-12.col-md-6.col-lg-6.location > div:nth-child(4) > div.ui-select > div > div > div.ui-select-match > span > span.ui-select-match-text.pull-left"));
    public  static final Target CAJA_DE_PAISES = Target.the("Contenedor para selecionar el pais").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public  static final  Target BOTOB_CONTINUAR_DISPOSITIVOS = Target.the("Botón que nos lleva o redirecciona al registro de dispositivos").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
