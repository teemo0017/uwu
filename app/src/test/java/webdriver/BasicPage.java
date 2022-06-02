package webdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import webdriver.Page.BasePage;
import webdriver.Page.BasicPageGetText;

public class BasicPage {
    BasicPageGetText basicPage;

    @BeforeEach
    public void setup(){
        basicPage = new BasicPageGetText();
        basicPage.navegarBasicGetText();
    }

    @Test
    public void ValidarTextoid1(){

        String textoReal = basicPage.tenertextoid1();
        String TextoEsperado = "A paragraph of text";
        assertEquals(TextoEsperado, textoReal);
    }

    public void ValidarTexto2() throws InterruptedException{
        Thread.sleep(5000);
        String TextoReal = basicPage.tenertextoid2();
        String TextoEsperado =  "Another paragraph of text";
        assertEquals(TextoEsperado, TextoReal);
    }

    // public ValidarMain(){
    //     String
    // }

    public static void closeBrowser() throws InterruptedException{
        Thread.sleep(5000);
        BasePage.closeBrowser();
    }
}
