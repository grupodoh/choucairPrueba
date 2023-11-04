package co.com.choucair.test.stepdefinitions;

import co.com.choucair.test.model.DatosGenerales;
import co.com.choucair.test.questions.Pregunta;
import co.com.choucair.test.tasks.*;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinitiosTest {

    @Before
    public  void setTheStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("juan quiere registrarse en Utest")
    public void juan_quiere_registrarse_en_utest() throws Exception{
        OnStage.theActorCalled("juan").wasAbleTo(Cargar.Pagina());
    }

    @When("juan ingresa la informacion correctamente")
    public void juan_ingresa_la_informacion_correctamente(List<DatosGenerales> datos) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatos.Pagina(datos),
                IngresarUbicacion.pagina(datos),
                IngresarDispositivos.pagina(datos),
                IngresarDatosFinales.Pagina(datos));
    }

    @Then("se completa el registro en la pagina")
    public void se_completa_el_registro_en_la_pagina(List<DatosGenerales> datos) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Pregunta.aLos(datos)));
    }
}
