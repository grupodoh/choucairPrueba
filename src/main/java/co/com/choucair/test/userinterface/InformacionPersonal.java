package co.com.choucair.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPersonal {

    public static final Target NOMBRES = Target.the("nombres").located(By.id("firstName"));
    public static final Target APELLIDOS = Target.the("apellidos").located(By.id("lastName"));
    public static final Target CORREO = Target.the("correo").located(By.id("email"));
    public static final Target MES = Target.the("mes").located(By.id("birthMonth"));
    public static final Target DIA = Target.the("dia").located(By.id("birthDay"));
    public static final Target ANIO = Target.the("año").located(By.id("birthYear"));
    public static final Target BOTON_CONTINUAR_UBICACION = Target.the("boton para ir al apartado de datos de recidencia").located(By.xpath("//a[@class = 'btn btn-blue']"));



}
