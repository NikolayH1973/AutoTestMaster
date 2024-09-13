package sanity;

import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

public class HappyFlows extends CommonOps {
    @Test
    public void test01_ClickLeftMenuTabs() {
        WebFlows.ClickOnMainNavigationMenu();
    }

    @Test(enabled = false)
    public void test02_ClickOnLanguageTab() {
        WebFlows.ClickOnLanguageTab();
    }

    @Test
    public void test03_SelectRussianLanguage() {
        WebFlows.ClickOnLanguageTab();
        WebFlows.selectLanguage("Russian");
    }


    @Test
    public void test04_SelectCurrency() {
        WebFlows.ClickOnCurrencyBox();
        WebFlows.SelectCurrency("SAR");
    }

    @Test(enabled = false)
    public void test05_Login() {
        String lang;
        WebFlows.ClickOnAccountBox();
        WebFlows.SelectLoginType("Login ");
    }

    @Test
    public void test05_SelectLogin() {
        String lang = "Russian";
        WebFlows.ClickOnAccountBox();
        if (lang.equalsIgnoreCase("English"))
            WebFlows.SelectLoginType("Login ");
        else if (lang.equalsIgnoreCase("Russian"))
            WebFlows.SelectLoginType("Войти ");
    }

    @Test(enabled = false)
    public void test06_Signup() {
        WebFlows.ClickOnAccountBox();
        WebFlows.SelectLoginType("Signup ");
    }

    @Test
    public void test06_SelectSignup() {
        String lang = "Russian";
        WebFlows.ClickOnAccountBox();
        if (lang.equalsIgnoreCase("English"))
            WebFlows.SelectLoginType("Signup ");
        else if (lang.equalsIgnoreCase("Russian"))
            WebFlows.SelectLoginType("Регистрация ");

    }

    @Test(enabled = true)
    public void test07_ClickTravelNavTabs() {
        ///  WebFlows.ClickHomeLogo();
        WebFlows.ClickOnTripMenu();
    }

}