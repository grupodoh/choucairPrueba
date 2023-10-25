package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDireccionPagina {

    public static  final Target CIUDAD = Target.the("Ciudad").located(By.id("city"));
    public static  final Target CODIGO_POSTAL = Target.the("Codigo postal").located(By.id("zip"));
    public static  final Target PAIS = Target.the("Pais").located(By.id("zip"));

}
