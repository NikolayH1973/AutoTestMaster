package sanity;

import extensions.Verifications;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pageObjects.Phptravels.EnglishLoginPage;
import utilities.CommonOps;
import workflows.WebFlows;

public class TestsScenarios extends CommonOps {
    String UserLang = "English"; //"English Russian;


    @Test (enabled = true)// Passed
    public void test02_VerifyLoginPage() {
        WebFlows.ClickOnLanguageTab();
        WebFlows.selectLanguage(UserLang);
        WebFlows.ClickOnAccountBox();
        System.out.println(WebFlows.UserLang());
        if (WebFlows.UserLang().equalsIgnoreCase("ENGLISH")) {
            WebFlows.SelectLoginType("Login ");
            Verifications.verifyTextInElement(EnglishLogin.LoginHeader, "Login");
        } else if (WebFlows.UserLang().equalsIgnoreCase("RUSSIAN")) {
            WebFlows.SelectLoginType("Войти ");
            Verifications.verifyTextInElement(EnglishLogin.LoginHeader, "Войти");
        }

    }

    @Test// passed
    public void test03_Login(){
        WebFlows.ClickHomeLogo();
        WebFlows.ClickOnLanguageTab();
        WebFlows.selectLanguage(UserLang);
        WebFlows.ClickOnAccountBox();
        if (WebFlows.UserLang().equalsIgnoreCase("English")) {
            WebFlows.SelectLoginType("Login ");
            WebFlows.SiteLogin("Niko.discount@gmail.com","Aa#11122233344");
        } else if (WebFlows.UserLang().equalsIgnoreCase("Russian")) {
            WebFlows.SelectLoginType("Войти ");
            WebFlows.SiteLogin("Niko.discount@gmail.com","Aa#11122233344");
        }
    }
}
