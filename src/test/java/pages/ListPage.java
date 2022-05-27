package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage{
    
    private String pathInput= "//body/form[1]/input[1]";
    private String locatorListCss= "name";

    public ListPage(){
        super(driver);
    }


    public void NavegarPaginaWeb(){
        navegateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void EscribirEstado(String value) throws InterruptedException{
        Thread.sleep(3000);
        write(pathInput, value);
    }

        public List<String> getAllResult(){
            List<WebElement> list = allElements(locatorListCss);
            List<String> stringFromList = new ArrayList<String>();

            for(WebElement elemento : list){
                stringFromList.add(elemento.getText());
            }

            return stringFromList;
        }
}
