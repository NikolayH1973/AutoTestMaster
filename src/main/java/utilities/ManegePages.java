package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.Phptravels.EnglishLoginPage;
import pageObjects.Phptravels.HomePagePhpTravels;

public class ManegePages extends Base {
    public static void initPhptravels() {
        MainPage = PageFactory.initElements(driver, HomePagePhpTravels.class);
        NavBar = PageFactory.initElements(driver, pageObjects.Phptravels.NavbarSupportedContend.class);
        EnglishLogin = PageFactory.initElements(driver, pageObjects.Phptravels.EnglishLoginPage.class);

    }
}
