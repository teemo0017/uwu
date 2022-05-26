package pages;

public class GooglePage extends BasePage {
    
    private String locatorInputBusqueda = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
    private String locatorClickBusqueda = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";

    public GooglePage (){
        super(driver);
    }

    public void navegarGoogle(){
        navegateTo("https://www.google.com/?&hl=es-419");
    }
    public void escribirBusqueda(String criterio){
        write(locatorInputBusqueda,criterio);
    }

    public void clickBotonBusqueda(){
        click(locatorClickBusqueda);
    }
}
