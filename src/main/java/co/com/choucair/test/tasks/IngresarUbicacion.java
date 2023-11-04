package co.com.choucair.test.tasks;

import co.com.choucair.test.model.DatosGenerales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.test.userinterface.InformacionDireccion.*;
public class IngresarUbicacion implements Task {

   private final List<DatosGenerales> datos;


    public IngresarUbicacion(List<DatosGenerales> datos) {
        this.datos = datos;
    }

    public static IngresarUbicacion pagina(List<DatosGenerales> datos) {
        return Tasks.instrumented(IngresarUbicacion.class,datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CIUDAD),
                Enter.theValue(datos.get(0).getStCiudad()).into(CIUDAD),
                Enter.theValue(datos.get(0).getStCodigo_Postal()).into(CODIGO_POSTAL),
                Scroll.to(BOTOB_CONTINUAR_DISPOSITIVOS),
                Click.on(BOTOB_CONTINUAR_DISPOSITIVOS));



    }
}
