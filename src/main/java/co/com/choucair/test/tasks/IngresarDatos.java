package co.com.choucair.test.tasks;

import co.com.choucair.test.model.DatosGenerales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.util.List;

import static co.com.choucair.test.userinterface.InformacionPersonal.*;


public class IngresarDatos implements Task {
    private final List<DatosGenerales> datos;
;
    public IngresarDatos( List<DatosGenerales> datos) {

        this.datos = datos;
    }

    public static IngresarDatos Pagina(List<DatosGenerales> datos){
        return Tasks.instrumented(IngresarDatos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(datos.get(0).getStNombre()).into(NOMBRES),
                Enter.theValue(datos.get(0).getStApellido()).into(APELLIDOS),
                Enter.theValue(datos.get(0).getStCorreo()).into(CORREO),
                SelectFromOptions.byVisibleText(datos.get(0).getStgMes()).from(MES),
                SelectFromOptions.byVisibleText(datos.get(0).getStgDia()).from(DIA),
                SelectFromOptions.byVisibleText(datos.get(0).getStAnio()).from(ANIO),
                Click.on(BOTON_CONTINUAR_UBICACION));
    }
}
