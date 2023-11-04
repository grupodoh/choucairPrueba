package co.com.choucair.test.questions;

import co.com.choucair.test.model.DatosGenerales;
import jdk.javadoc.internal.doclets.formats.html.markup.Text;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class Pregunta implements Question<Boolean>{

    private final List<DatosGenerales> datos;

    public Pregunta(List<DatosGenerales> datos, Target BOTON_FIN_CONFIGURACION) {
        this.datos = datos;
        this.BOTON_FIN_CONFIGURACION = BOTON_FIN_CONFIGURACION;
    }

    private Target BOTON_FIN_CONFIGURACION;

    public Pregunta(List<DatosGenerales> datos) {
        this.datos = datos;
    }

    public static Question<Boolean> aLos(List<DatosGenerales> datos) {
        return new Pregunta(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String BtnFinal = Text.of(BOTON_FIN_CONFIGURACION).viewedBy(actor).asString();
        return datos.get(0).getStTextoFinal1().equals(BtnFinal);
    }


}
