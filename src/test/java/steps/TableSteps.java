package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TablePage;

public class TableSteps {
    

    TablePage tablePage = new TablePage();

    @Given("^navego al sitio web de la tabla estatica$")
    public void NavegarPaginaWeb(){
       tablePage.NavegarPaginaWeb(); 
    }

    

    @Then("^Retorna el valor de la celda fila 5 columna 2$")
    public void obtenerValorCelda(){
        String valorReal = tablePage.obtenerValorcelda(5, 2);

        assertEquals("r: 5, c: 2", valorReal);
    }

    @Then("^Como usuario valido se se muestra la tabla$")
    public void ValidarSimuestraLatabla(){
        boolean valor = tablePage.visualizarTable();
        assertTrue("No Se muestra la tabla", valor);
    }

    }
