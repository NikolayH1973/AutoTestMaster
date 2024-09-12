package workflows;

import extensions.UIActions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import pageObjects.Phptravels.NavbarSupportedContend;
import utilities.CommonOps;

public class WebFlows extends CommonOps {


    public static void ClickHomeLogo() {
        UIActions.click(NavBar.HomeLogo);
    }

    public static void SelectFlightFrom() {
        UIActions.selectFlightFrom(driver, 2);
    }

    public static void ClickOnFlightsFromBox() {

        UIActions.click(MainPage.FlightFromBox);
    }

    public static void ClickOnMainNavigationMenu() {
        UIActions.ClickOnMenuItems(NavBar.LeftMenuItems);
    }

    public static void ClickOnTripMenu() {
        UIActions.ClickOnMenuItems(MainPage.TripNavigationMenu);
    }

    public static void PrintLeftMenu() {
        UIActions.PrintMenuItems(NavBar.LeftMenuItems);
    }

    public static void PrintTripMenu() {
        UIActions.PrintMenuItems(MainPage.TripNavigationMenu);
    }

    public static void ClickOnLanguageTab() {
        UIActions.click(NavBar.LanguageTab);
    }

    public static void ClickOnCurrencyBox() {
        UIActions.click(NavBar.CurrencyBox);

    }

    public static void selectLanguage(String lang) {
        UIActions.click(NavBar.langElement(lang));

    }

    public static void SelectCurrency(String currency) {
        UIActions.click(NavBar.CurrencyElement(currency));

    }

    public static void ClickOnAccountBox(){
        UIActions.click(NavBar.AccountBox);
    }
    public static void SelectLoginType(String type){
        UIActions.click(NavBar.SignType(type));
    }
}
