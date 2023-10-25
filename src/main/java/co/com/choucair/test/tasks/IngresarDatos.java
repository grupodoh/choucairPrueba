package co.com.choucair.test.tasks;

import co.com.choucair.test.model.DatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static co.com.choucair.test.userinterface.InformacionPersonalPagina.*;


public class IngresarDatos implements Task {
   private  final String Nombre ;
    private  final String Apellidos ;
    private  final String Correo ;
    private  final String Mes ;
    private  final String Dia ;
    private  final String Anio ;
;
    public IngresarDatos( String Nombre,
                          String Apellidos,
                          String Correo,
                          String Mes,
                          String Dia,
                          String Anio) {

        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Correo = Correo;
        this.Mes = Mes;
        this.Dia = Dia;
        this.Anio = Anio;
    }

    public static IngresarDatos Pagina(String Nombre, String Apellidos, String Correo, String Mes, String Dia, String Anio){
        return Tasks.instrumented(IngresarDatos.class, Nombre,Apellidos, Correo,Mes, Dia,  Anio);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(Nombre).into(NOMBRES),
                Enter.theValue(Apellidos).into(APELLIDOS),
                Enter.theValue(Correo).into(CORREO),
                SelectFromOptions.byVisibleText(Mes).from(MES),
                SelectFromOptions.byVisibleText(Dia).from(DIA),
                SelectFromOptions.byVisibleText(Anio).from(ANIO),
                Click.on(BOTON_CONTINUAR_UBICACION));
    }
}
