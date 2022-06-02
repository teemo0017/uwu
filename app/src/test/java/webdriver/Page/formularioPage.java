package webdriver.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.log.Log;

public class formularioPage extends BasePage {
    private String locatorColor = "//input[@id='colour-picker']";
    private String locatorFecha = "//input[@id='date-picker']";
    private String locatorFechaLocal = "//input[@id='date-time-picker']";
    private String locatorEmail = "//input[@id='email-field']";
    private String locatorMes = "//input[@id='month-field']";
    private String locatorNumero = "//input[@id='number-field']";
    private String locatorSubmit = "//body/div[1]/div[3]/form[1]/div[7]/input[2]";

    public formularioPage() {
        super(driver);
        
    }

    public void navegar(){
        navegateTo("https://testpages.herokuapp.com/styled/html5-form-test.html");
    }

    public void selectColor(String colorName){
        String color = org.openqa.selenium.support.Color.fromString(colorName).asHex();
        selecionarColorPicker(locatorColor, color);

    }
    
    public void selecionarFecha(String value){
        write(locatorFecha, value);
    }

   
    public void selecionarFechaPicker(String value){
        selecionarFechaPicker(locatorFechaLocal, value);
    }

    public void selecionarCorreo(String value){
        write(locatorEmail, value);
    }
    public void selecionarMes(String value){
        selecionarFechaPicker(locatorMes, value);
    }
    public void selecionarNumero(String value){
        write(locatorNumero, value);
    }
    public void darclick(){
        click(locatorSubmit);
    }




    //Validar

    public String obtenerColor() {
        return getTextElement("//li[@id='_valuecolour']");
  
    }
    public String obtenerFecha() {
        return getTextElement("//li[@id='_valuedate']");
  
    }
    public String obtenerFechaLocal() {
        return getTextElement("//li[@id='_valuedatetime']");
  
    }
    public String obtenerEmail() {
        return getTextElement("//li[@id='_valueemail']");
  
    }
    public String obtenerMes() {
        return getTextElement("//li[@id='_valuemonth']");
  
    }
    public String obtenerNumero() {
        return getTextElement("//li[@id='_valuenumber']");
  
    }
}
