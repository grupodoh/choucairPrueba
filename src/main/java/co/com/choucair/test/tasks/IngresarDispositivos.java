package co.com.choucair.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static co.com.choucair.test.userinterface.InformacionDireccion.BOTOB_CONTINUAR_DISPOSITIVOS;
import static co.com.choucair.test.userinterface.InformacionDispositivos.*;

public class IngresarDispositivos implements Task {

    private  final String Dispositivo_Movil;
    private  final String Modelo_Dispositivo;
    private  final String Verion_So_Movil;



    public IngresarDispositivos( String dispositivoMovil, String modeloDispositivo, String verionSoMovil) {

        Dispositivo_Movil = dispositivoMovil;
        Modelo_Dispositivo = modeloDispositivo;
        Verion_So_Movil = verionSoMovil;
    }

    public static IngresarDispositivos pagina( String dispositivoMovil, String modeloDispositivo, String verionSoMovil) {
        return Tasks.instrumented(IngresarDispositivos.class,dispositivoMovil,modeloDispositivo,verionSoMovil);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(DISPOSITIVO_MOVIL_CONT),
                Enter.theValue(Dispositivo_Movil).into(DISPOSITIVO_MOVIL_INPUT)
                        .thenHit(Keys.ARROW_DOWN)
                        .thenHit(Keys.ENTER),
                Click.on(MODELO_CONT),
                Enter.theValue(Modelo_Dispositivo).into(MODEL_INPUT)
                        .thenHit(Keys.ARROW_DOWN)
                        .thenHit(Keys.ENTER),
                Click.on(VERSION_SO_MOVIL_CONT),
                Enter.theValue(Verion_So_Movil).into(VERSION_SO_MOVIL_INPUT),
                Scroll.to(BOTON_CONTINUAR_ULTIMA_FASE),
                Click.on(BOTON_CONTINUAR_ULTIMA_FASE));

    }

}
