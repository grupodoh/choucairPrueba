package co.com.choucair.test.stepdefinitions;

import co.com.choucair.test.tasks.Cargar;
import co.com.choucair.test.tasks.IngresarDatos;


import co.com.choucair.test.tasks.IngresarDispositivos;
import co.com.choucair.test.tasks.IngresarUbicacion;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitiosTest {

    @Before
    public  void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("juan quiere registrarse en Utest")
    public void juan_quiere_registrarse_en_utest() {
        OnStage.theActorCalled("juan").wasAbleTo(Cargar.Pagina());
    }

    @When("juan ingresa la informacion correctamente")
    public void juan_ingresa_la_informacion_correctamente() throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatos.Pagina("Juan", "Moncaleano", "juanmonca1075@gmail.com", "August", "25", "1987"),
                IngresarUbicacion.pagina("Neiva","410001","Colombia"),
                IngresarDispositivos.pagina("Windows","11 Pro","Spanish","Xiaomi","Redmi Note 12 Pro","Android 13"));
    }

    @Then("se completa el registro en la pagina")
    public void se_completa_el_registro_en_la_pagina(){}
}
