package co.com.choucair.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.choucair.test.userinterface.FinRegistro.*;

public class IngresarDatosFinales implements Task {

    private final String PASSWORD;
    private final String PASSWORD2;

    public IngresarDatosFinales(String PASSWORD, String PASSWORD2) {
        this.PASSWORD = PASSWORD;
        this.PASSWORD2 = PASSWORD2;
    }

    public static IngresarDatosFinales Pagina(String PASSWORD, String PASSWORD2) {
        return Tasks.instrumented(IngresarDatosFinales.class,PASSWORD,PASSWORD2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(PASSWORD).into(PASSWORD_FIN),
                Enter.theValue(PASSWORD2).into(PASSWORD2_FIN),
                Click.on(MANTENTE_INFORMADO),
                Click.on(ACEPTA_TERMINOS),
                Click.on(ACEPTA_POLITICAS),
                Scroll.to(BOTON_FIN_CONFIGURACION));

    }
}
