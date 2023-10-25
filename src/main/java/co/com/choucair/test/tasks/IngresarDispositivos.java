package co.com.choucair.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.choucair.test.userinterface.InformacionDireccion.BOTOB_CONTINUAR_DISPOSITIVOS;
import static co.com.choucair.test.userinterface.InformacionDispositivos.*;

public class IngresarDispositivos implements Task {

    private  final String So_Pc;
    private  final String Version_So;
    private  final String Idioma_So;
    private  final String Dispositivo_Movil;
    private  final String Modelo_Dispositivo;
    private  final String Verion_So_Movil;



    public IngresarDispositivos(String soPc, String versionSo, String idiomaSo, String dispositivoMovil, String modeloDispositivo, String verionSoMovil) {
        So_Pc = soPc;
        Version_So = versionSo;
        Idioma_So = idiomaSo;

        Dispositivo_Movil = dispositivoMovil;
        Modelo_Dispositivo = modeloDispositivo;
        Verion_So_Movil = verionSoMovil;
    }

    public static IngresarDispositivos pagina(String soPc, String versionSo, String idiomaSo, String dispositivoMovil, String modeloDispositivo, String verionSoMovil) {
        return Tasks.instrumented(IngresarDispositivos.class,soPc,versionSo,idiomaSo,dispositivoMovil,modeloDispositivo,verionSoMovil);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(SO_PC_CONT),
                Enter.theValue(So_Pc).into(SO_PC_TEXTO),
                Click.on(VERSION_SO_CONT),
                Enter.theValue(Version_So).into(VERSION_SO_TEXTO),
                Click.on(IDIOMA_SO_CONT),
                Enter.theValue(Idioma_So).into(IDIOMA_SO_TEXTO),
                Click.on(DISPOSITIVO_MOVIL_CONT),
                Enter.theValue(Dispositivo_Movil).into(DISPOSITIVO_MOVIL_TEXTO),
                Click.on(MODELO_CONT),
                Enter.theValue(Modelo_Dispositivo).into(MODELO_TEXTO),
                Click.on(VERSION_SO_MOVIL_CONT),
                Enter.theValue(Verion_So_Movil).into(VERSION_SO_MOVIL_TEXT),
                Scroll.to(BOTON_CONTINUAR_ULTIMA_FASE),
                Click.on(BOTON_CONTINUAR_ULTIMA_FASE));
    }

}
