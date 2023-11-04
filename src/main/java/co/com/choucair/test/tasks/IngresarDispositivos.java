package co.com.choucair.test.tasks;

import co.com.choucair.test.model.DatosGenerales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.test.userinterface.InformacionDireccion.BOTOB_CONTINUAR_DISPOSITIVOS;
import static co.com.choucair.test.userinterface.InformacionDispositivos.*;

public class IngresarDispositivos implements Task {

    private final List<DatosGenerales> datos;

    public IngresarDispositivos( List<DatosGenerales> datos) {
        this.datos = datos;

    }

    public static IngresarDispositivos pagina( List<DatosGenerales> datos) {
        return Tasks.instrumented(IngresarDispositivos.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(DISPOSITIVO_MOVIL_CONT),
                Enter.theValue(datos.get(0).getStDispositivo_Movil()).into(DISPOSITIVO_MOVIL_INPUT)
                        .thenHit(Keys.ARROW_DOWN)
                        .thenHit(Keys.ENTER),
                Click.on(MODELO_CONT),
                Enter.theValue(datos.get(0).getStModelo_Dispositivo()).into(MODEL_INPUT)
                        .thenHit(Keys.ARROW_DOWN)
                        .thenHit(Keys.ENTER),
                Click.on(VERSION_SO_MOVIL_CONT),
                Enter.theValue(datos.get(0).getStVerion_So_Movil()).into(VERSION_SO_MOVIL_INPUT),
                Scroll.to(BOTON_CONTINUAR_ULTIMA_FASE),
                Click.on(BOTON_CONTINUAR_ULTIMA_FASE));

    }

}
