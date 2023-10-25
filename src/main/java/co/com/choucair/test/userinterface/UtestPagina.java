package co.com.choucair.test.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://utest.com/")
public class UtestPagina extends PageObject {

    public static final Target REGISTRAR = Target.the("Boton para registrese")
            .located(By.xpath("//a[@class = 'unauthenticated-nav-bar__sign-up']"));
}
