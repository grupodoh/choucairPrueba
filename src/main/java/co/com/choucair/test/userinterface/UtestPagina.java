package co.com.choucair.test.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://utest.com/")
public class UtestPagina extends PageObject {

    public static final Target REGISTRAR = Target.the("Botón que nos lleva al primer formulario del registro de usuarios")
            .located(By.xpath("//a[@class = 'unauthenticated-nav-bar__sign-up']"));
}
