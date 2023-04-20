

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class JUnitannotations {
        private WebDriver driver;
        String url;

        @Before
        public void setUp() {

            String driverExecutablePath = "C:/Users/svetlana.damianova/IdeaProjects/SvetlanaMaven2/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverExecutablePath);
            url = "http://www.1bet.com";
            driver = new ChromeDriver();

        }

        @After
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void loadLoginPage() throws InterruptedException {
            driver.get(url);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            Thread.sleep(1000);
            driver.manage().window().maximize();
            Thread.sleep(1000);
            //svetlanacasino


        }
}
