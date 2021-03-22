
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*; // nie wiem czemu dorzuca kolejne importy
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class SeleniumTest1 {
    WebDriver driver;
    @BeforeAll // instalacja przed
    public static void webDriverSetup()
    {
        WebDriverManager.edgedriver().setup();
    }
    FileReading carsData = new FileReading();

    @Test
    public void edgeTest()
    {
        driver = new EdgeDriver();
        driver.get("https://hello.friday.de/quote/selectPrecondition");

        // cookies
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.id("uc-btn-accept-banner"));
        element.click();
        // first page
        element = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        element.click();
        // second page
        element = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        element.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // cars search

        /*
        <input class="TextInput__textInput--1vhQY" placeholder="Auswahl filtern" name="makeFilter" value="">
         */
        //driver.quit();

    }
}
