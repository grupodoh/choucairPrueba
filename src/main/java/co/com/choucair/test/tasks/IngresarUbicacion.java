package co.com.choucair.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static co.com.choucair.test.userinterface.InformacionDireccion.*;
public class IngresarUbicacion implements Task {

    private final String Ciudad;
    private final String Codigo_Postal;
    private final String Pais;


    public IngresarUbicacion(String ciudad, String codigo_Postal, String pais) {
        Ciudad = ciudad;
        Pais = pais;
        Codigo_Postal = codigo_Postal;
    }

    public static IngresarUbicacion pagina(String ciudad, String codigo_Postal, String pais) {
        return Tasks.instrumented(IngresarUbicacion.class,ciudad,codigo_Postal,pais);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(Ciudad).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Enter.theValue(Codigo_Postal).into(CODIGO_POSTAL),
                Click.on(CAJA_DE_PAISES),
                Enter.theValue(Pais).into(PAIS)
                        .thenHit(Keys.ARROW_DOWN)
                        .thenHit(Keys.ENTER),
                Scroll.to(BOTOB_CONTINUAR_DISPOSITIVOS),
                Click.on(BOTOB_CONTINUAR_DISPOSITIVOS));



    }
}
