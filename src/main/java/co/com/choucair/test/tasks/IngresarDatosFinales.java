package co.com.choucair.test.tasks;

import co.com.choucair.test.model.DatosGenerales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.choucair.test.userinterface.FinRegistro.*;

public class IngresarDatosFinales implements Task {

    private final List<DatosGenerales> datos;

    public IngresarDatosFinales(List<DatosGenerales> datos) {
        this.datos = datos;
    }

    public static IngresarDatosFinales Pagina(List<DatosGenerales> datos) {
        return Tasks.instrumented(IngresarDatosFinales.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStPASSWORD()).into(PASSWORD_FIN),
                Enter.theValue(datos.get(0).getStPASSWORD2()).into(PASSWORD2_FIN),
                Click.on(MANTENTE_INFORMADO),
                Click.on(ACEPTA_TERMINOS),
                Click.on(ACEPTA_POLITICAS),
                Scroll.to(BOTON_FIN_CONFIGURACION));

    }
}
