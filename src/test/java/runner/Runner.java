package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    tags = "@Table"
)
public class Runner {
    @AfterClass
    public static void cleanDriver()throws InterruptedException{
        Thread.sleep(3000);
        BasePage.closeBrowse();
    }
}
