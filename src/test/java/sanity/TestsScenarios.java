package sanity;

import extensions.Verifications;
import org.testng.annotations.Test;
import pageObjects.Phptravels.EnglishLoginPage;
import utilities.CommonOps;
import workflows.WebFlows;

public class TestsScenarios  extends CommonOps {
    @Test
    public void VerifyTextInEnglishLoginPage() {
        String lang = "English";
        WebFlows.ClickOnAccountBox();
        if (lang.equalsIgnoreCase("English"))
            WebFlows.SelectLoginType("Login ");
        else if (lang.equalsIgnoreCase("Russian"))
            WebFlows.SelectLoginType("Войти ");
        Verifications.verifyTextInElement(EnglishLogin.LoginHeader,"Login");
    }

}
