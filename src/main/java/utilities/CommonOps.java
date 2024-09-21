package utilities;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {


    public static void initBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
        else if (browserType.equalsIgnoreCase("edge"))
            driver = initEdgeDriver();
        else if (browserType.equalsIgnoreCase("safari"))
            driver = initSafaririver();
        else
            throw new RuntimeException("Invalide Brawser type");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,5);
        driver.get("https://www.phptravels.net/");

        ManegePages.initPhptravels();


    }

    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }


    public static WebDriver initFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }


    public static WebDriver initEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        return driver;
    }


    public static WebDriver initSafaririver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new SafariDriver();
        return driver;
    }


    @BeforeClass
    public void startSession() {
        String platform = "web";

        if (platform.equalsIgnoreCase("web"))
            initBrowser("chrome");
//        else if (platform.equalsIgnoreCase("mobile"))
//            initMobile();
        else
            throw new RuntimeException("Invalide platform name");
    }

    @AfterClass
    public void closeSession() {
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        driver.quit();
    }


}
