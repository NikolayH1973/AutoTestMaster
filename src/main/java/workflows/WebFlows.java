package workflows;

import extensions.UIActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import pageObjects.Phptravels.NavbarSupportedContend;
import utilities.CommonOps;

public class WebFlows extends CommonOps {

// Click on Logo and return to the Home page
    public static void ClickHomeLogo() {
        UIActions.click(NavBar.HomeLogo);
    }
// Select the Flight from box
    public static void ClickOnFlightsFromBox() {
        UIActions.click(MainPage.FlightFromBox);
    }
// runs and click on all maine menu tabs
    public static void ClickOnMainNavigationMenu() {
        UIActions.ClickOnMenuItems(NavBar.LeftMenuItems);
    }
// runs and click on all trip menu
    public static void ClickOnTripMenu() {
        UIActions.ClickOnMenuItems(MainPage.TripNavigationMenu);
    }
// print maine menu
    public static void PrintLeftMenu() {
        UIActions.PrintMenuItems(NavBar.LeftMenuItems);
    }
// print trip menu
    public static void PrintTripMenu() {
        UIActions.PrintMenuItems(MainPage.TripNavigationMenu);
    }
// click and open language box in order to select language of the site
    public static void ClickOnLanguageTab() {
        UIActions.click(NavBar.LanguageTab);
    }
// click and open currency box in order to select currency
    public static void ClickOnCurrencyBox() {
        UIActions.click(NavBar.CurrencyBox);

    }
// Select presenting language
    public static void selectLanguage(String lang) {
        UIActions.click(NavBar.langElement(lang));

    }
// Select presenting Currency
    public static void SelectCurrency(String currency) {
        UIActions.click(NavBar.CurrencyElement(currency));

    }
// Click an open the account box in order to display the account options
    public static void ClickOnAccountBox(){
        UIActions.click(NavBar.AccountBox);
    }
    // Select Login type
    public static void SelectLoginType(String type){
        UIActions.click(NavBar.SignType(type));
    }

// select user language
  public static String UserLang(){
        return
        UIActions.SelectedText(NavBar.SiteLang);
  }

  public static void  SiteLogin (String email,String pass){
        UIActions.updatetext(UserLoginPage.txt_email,email);
        UIActions.updatetext(UserLoginPage.txt_password, pass);
        UIActions.click(UserLoginPage.LoginButton);
  }

}
