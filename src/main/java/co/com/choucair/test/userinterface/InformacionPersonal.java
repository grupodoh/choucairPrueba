package co.com.choucair.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPersonal extends PageObject {

    public static final Target NOMBRES = Target.the("Campo de texto para registrar el nombre").located(By.id("firstName"));
    public static final Target APELLIDOS = Target.the("Campo de texto para registrar el apellidos").located(By.id("lastName"));
    public static final Target CORREO = Target.the("Campo de texto para registrar el correo").located(By.id("email"));
    public static final Target MES = Target.the("Campo de texto para registrar el mes").located(By.id("birthMonth"));
    public static final Target DIA = Target.the("Campo de texto para registrar el dia").located(By.id("birthDay"));
    public static final Target ANIO = Target.the("Campo de texto para registrar el año").located(By.id("birthYear"));
    public static final Target BOTON_CONTINUAR_UBICACION = Target.the("Botón para ir a la página de datos de recidencia o ubicación").located(By.xpath("//a[@class = 'btn btn-blue']"));



}
