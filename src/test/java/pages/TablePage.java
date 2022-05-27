package pages;

public class TablePage extends BasePage{
    

    String locatorDriver = "//body/div[@id='root']/div[1]";
    String locatorTable = "//body/div[@id='root']/div[1]/table";
    public TablePage (){
        super(driver);
    }

    public void NavegarPaginaWeb(){
        navegateTo("https://1v2njkypo4.csb.app/");
    }


public String obtenerValorcelda(int row, int column){
    row++;
    column++;
    return getValueFromTable(locatorDriver, row , column);
}

public boolean visualizarTable(){
    return ValidateExitElement(locatorTable);
}

public void modificarValorCelda(int row, int column, String value){
    row++;
    column++;
     setvalueFromTable(locatorDriver, row , column, value);
}
}
