package sanity;

import extensions.Verifications;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pageObjects.Phptravels.EnglishLoginPage;
import utilities.CommonOps;
import workflows.WebFlows;

public class TestsScenarios extends CommonOps {
    String UserLang = "English"; //"English Russian;

    @Test
    public void VerifyTextInEnglishLoginPage() {
        String lang = "English";
        WebFlows.ClickOnAccountBox();
        if (lang.equalsIgnoreCase("English"))
            WebFlows.SelectLoginType("Login ");
        else if (lang.equalsIgnoreCase("Russian"))
            WebFlows.SelectLoginType("Войти ");
        Verifications.verifyTextInElement(EnglishLogin.LoginHeader, "Login");
    }

    @Test
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
}
