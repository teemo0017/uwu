package webdriver.Page;



public class BasicPageGetText extends BasePage {

    public BasicPageGetText() {
        super(driver);
    }
    
    public void navegarBasicGetText(){
        navegateTo("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
    }
    public String tenertextoid1(){
        return findbyId("para1").getText();
    }
    public String tenertextoid2(){
        return findbyId("para2").getText();
    }

    public String obtenerTextoClassMain(){
        return findbyClass("main").getText();
    }
}
