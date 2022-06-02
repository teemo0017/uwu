package webdriver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import webdriver.Page.BasePage;
import webdriver.Page.ShopPage;

public class Shop {

    BasePage  basepage;
    ShopPage shopPage;

    @BeforeEach
    public void configuracion(){
        shopPage = new ShopPage();
    }
    

    @Test
    public void testearShopBuscoGoogle() {
        shopPage.TextearTienda();
    }

    @AfterAll
    public static void closeBrowser() throws InterruptedException{
        Thread.sleep(5000);
        BasePage.closeBrowser();
    }

}
