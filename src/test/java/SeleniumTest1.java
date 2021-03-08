
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*; // nie wiem czemu dorzuca kolejne importy
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest1 {
    WebDriver driver;
    @BeforeAll // instalacja przed
    public static void webDriverSetup()
    {
        WebDriverManager.edgedriver().setup();
    }
    @Test
    public void edgeTest()
    {
        driver = new EdgeDriver();
        driver.get("https://hello.friday.de/quote/selectPrecondition");

        // cookies
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
            driver.quit();
        }
        WebElement element = driver.findElement(By.id("uc-btn-accept-banner"));
        element.click();
        element = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        element.click();
        driver.quit();
    }
}
