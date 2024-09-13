package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Phptravels.EnglishLoginPage;
import pageObjects.Phptravels.HomePagePhpTravels;
import pageObjects.Phptravels.LoginPage;
import pageObjects.Phptravels.NavbarSupportedContend;

public class    Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static HomePagePhpTravels MainPage;
    protected static EnglishLoginPage EnglishLogin;
    protected static NavbarSupportedContend NavBar;
    protected static LoginPage UserLoginPage;
}
