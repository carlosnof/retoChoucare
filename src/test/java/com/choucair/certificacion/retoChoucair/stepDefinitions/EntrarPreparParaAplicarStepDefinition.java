package com.choucair.certificacion.retoChoucair.stepDefinitions;

import com.choucair.certificacion.retoChoucair.tasks.AbrirPagina;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class EntrarPreparParaAplicarStepDefinition {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Carlos");
    }

    @Dado("^que Carlos ingreso a la página de Choucair$")
    public void queCarlosIngresoALaPáginaDeChoucair() {
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirPagina.enChrome());
    }

    @Cuando ("^el intenta entrar a la pagina de Empleos$")
    public void elIntentaEntrarALaPaginaDeEmpleos() {
    }

    @Entonces("^el debera ver el texto PREPARARSE PARA APLICAR$")
    public void elDeberaVerElTextoPREPARARSEPARAAPLICAR() {
    }

}
