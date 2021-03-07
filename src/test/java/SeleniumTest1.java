
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

    //@BeforeClass // instalacja przed
//    public static void setupClass() {
       // WebDriverManager.edgedriver().setup();
       // WebDriverManager.firefoxdriver().setup();
//    }

    @Test
    public void firstTest()
    {
        // windows path to chromedriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://hello.friday.de/quote/selectPrecondition"); //opening site
        driver.quit();//quitting site
        //System.setProperty("webdriver.chrome.driver","resources/windows/chromedriver.exe");

    }
}
