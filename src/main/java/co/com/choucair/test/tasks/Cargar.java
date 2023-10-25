package co.com.choucair.test.tasks;

import co.com.choucair.test.userinterface.UtestPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class Cargar implements Task {
    private UtestPagina utestPagina;

    public static Cargar Pagina(){

        return Tasks.instrumented(Cargar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Open.browserOn(utestPagina),
                Click.on(utestPagina.REGISTRAR));
    }
}
