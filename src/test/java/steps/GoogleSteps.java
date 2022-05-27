package steps;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
    
    GooglePage googlePage = new GooglePage();


    @Given("^Como usuario navego al sitio de google$")
    public void navegarAGoogle(){
    googlePage.navegarGoogle();
    }
    @When("^como usuario busco la palabra pinguino$")
    public void escribirCriterioBusqueda(){
        googlePage.escribirBusqueda("pinguino");
    }

    @And("^Como usuario doy click en el boton buscar$")
    public void clickBotonBusqueda(){
        googlePage.clickBotonBusqueda();
    }

    @Then("^Espero que se visualice el elemento con el texto 10 razones genial para celebrar a los pingüinos$")
    public void obtenerTextoDeBusqueda(){
        String textoEsperado = "Spheniscidae";
        String texto = googlePage.ObtenerBusquedaElemento();
        boolean estado = texto.contains(textoEsperado);
        assertTrue("no se encontro mensaje", estado);
    }

    @When("^Como usuario busco la palabra ping pong$")
    public void escribirCriterioBusquedaPingPon(){
        googlePage.escribirBusqueda("ping pong");
    }

    @And("^Como usuario le doy Enter")
    public void darTeclaEnter(){
        googlePage.darEnter();
    }


    @When("^Como usuario busco la palabra Facebook$")
    public void escribirCriterioBusquedaFacebook(){
        googlePage.escribirBusqueda("Facebook");
    }

    @And("^Como usuario le doy Enter1")
    public void darTeclaEnter1(){
        googlePage.darEnter();
    }


    @When("^Como usuario busco la palabra Instagram$")
    public void escribirCriterioBusquedaInstagram(){
        googlePage.escribirBusqueda("Instagram");
    }

    @And("^Como usuario le doy Enter2")
    public void darTeclaEnter2(){
        googlePage.darEnter();
    }

    @When("^Como usuario busco la palabra Banco General$")
    public void escribirCriterioBusquedaBancoGeneral(){
        googlePage.escribirBusqueda("Banco Generl");
    }

    @And("^Como usuario le doy Enter3")
    public void darTeclaEnter3(){
        googlePage.darEnter();
    }
    @When("^Como usuario busco la palabra Amor$")
    public void escribirCriterioBusquedaAmor(){
        googlePage.escribirBusqueda("Que es el amor");
    }

    @And("^Como usuario le doy Enter4")
    public void darTeclaEnter4(){
        googlePage.darEnter();
    }

    
}
