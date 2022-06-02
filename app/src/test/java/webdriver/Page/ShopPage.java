package webdriver.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class ShopPage extends BasePage {

    public ShopPage() {
        super(driver);
        //TODO Auto-generated constructor stub
    }


    public void TextearTienda(){

        String locatorTable = "/html/body/shop-app//iron-pages/shop-list//ul/li[2]";
        BasePage.navegateTo("https://shop.polymer-project.org/list/mens_outerwear");
        WebElement vistaCamisetas = BasePage.find("//shop-app[contains(text(),'SHOP')]");
        SearchContext shopApp = BasePage.elementShadow(vistaCamisetas);
        WebElement ironPage = shopApp.findElement(By.cssSelector("iron-pages"));
        WebElement ironShopList = ironPage.findElement(By.cssSelector("iron-pages>shop-list"));
        SearchContext ironShopListShadow = BasePage.elementShadow(ironShopList);
        WebElement gripdShop = ironShopListShadow.findElement(By.cssSelector("ul"));
        WebElement info = gripdShop.findElement(By.cssSelector("ul>li:nth-child(3)"));

        info.click();

    }


    
}
