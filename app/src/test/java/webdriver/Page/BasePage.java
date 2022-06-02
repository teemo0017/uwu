package webdriver.Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;
    private static JavascriptExecutor jse;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Teemo\\Documents\\workspace\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        jse = (JavascriptExecutor) driver;
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BasePage.jse = (JavascriptExecutor) driver;
    }

    public static void closeBrowser() {

        
        driver.quit();
    }

    public static void navegateTo(String url) {
        driver.get(url);
    }

    public static WebElement find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));

    }

    public void write(String locator, String value) {
        find(locator).clear();
        find(locator).sendKeys(value);
    }

    public void click(String locator) {
        find(locator).click();
    }

    public String getTextElement(String locator) {
        return find(locator).getText();
    }

    public String getValueFromTable(String locator, int row, int column) {
        String cell = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
        return find(cell).getText();

    }

    public boolean validateExistElement(String locator) {
        return find(locator).isDisplayed();
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public static SearchContext elementShadow(WebElement element){
        SearchContext elementShadow = (SearchContext) jse.executeScript("return arguments[0].shadowRoot", element);
        return elementShadow;
    }

    public  WebElement findbyId(String id){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }
    public WebElement findbyClass(String clase){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(clase)));
    }

    public List<WebElement> obtenerFilas(String locator){
       WebElement table = find(locator + "/table/tbody");
       List<WebElement> rows = table.findElements(By.tagName("tr"));
       return rows;
    }

    public List<WebElement> obtenerTds(WebElement rows){
        return rows.findElements(By.tagName("td"));
    }

    public void selecionarColorPicker(String locator, String color){

        WebElement element = find(locator);
        jse.executeScript("arguments[0].value='" + color + "';" , element);
    }

    public void selecionarFechaPicker(String locator, String fecha){

        WebElement element = find(locator);
        jse.executeScript("arguments[0].value='" + fecha + "';" , element);
    }




}
 