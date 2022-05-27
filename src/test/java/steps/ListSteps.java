package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

public class ListSteps {
    

    ListPage listPage = new ListPage();

    @Given("^Como usuario navego al sitio web de la lista$")
    public void Navegar(){
        listPage.NavegarPaginaWeb();
    }

    @When("^Como usuario busco un estado en la lista$")
    public void escribirBusqueda() throws InterruptedException{
        listPage.EscribirEstado("New York");
    }
    @Then("^Como usuario encuentro una ciudad de la lista$")
    public void ValidarElementos(){
        String City = "Yonkers, New York";
        List<String> lista = listPage.getAllResult();
        boolean existeCiudad = lista.contains(City);
        assertTrue(existeCiudad);
    }
}
