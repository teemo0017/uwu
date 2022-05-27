package pages;

public class GooglePage extends BasePage {
    
    private String locatorInputBusqueda = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
    private String locatorClickBusqueda = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    private String localtextfound = "//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]";

    public GooglePage (){
        super(driver);
    }

    public void navegarGoogle(){
        navegateTo("https://www.google.com");
    }
    public void escribirBusqueda(String criterio){
        write(locatorInputBusqueda,criterio);
    }

    public void clickBotonBusqueda(){
        click(locatorClickBusqueda);
    }

    public String ObtenerBusquedaElemento(){

        return getTextElement(localtextfound);
    }

    public void darEnter(){
        keyEnter(locatorInputBusqueda);
    }

}
