package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import utilities.Base;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public  class UIActions extends CommonOps {
    public static void click(WebElement element) {
        element.click();
        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
    }

    public static void sendtext(WebElement element, String txt) {
        element.sendKeys(txt);
    }

public static  void updateLanguage(List<WebElement> element ,int i){
   element.get(i).click();
    Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
}



 public static void ClickOnMenuItems(List<WebElement> MenuItems){
        int i=0;
        for (i=0;i<MenuItems.size();i++){
            MenuItems.get(i).click();
            Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
        }
 }

 public static void PrintMenuItems(List<WebElement> MenuItems){
     Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
     for(int i=0;i<MenuItems.size();i++){
         System.out.println(MenuItems.get(i).getText());
     }
 }


 public static void printLeftMenuItems(WebDriver driver){
     Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
        for (int i=0;i<MainPage.TripNavigationMenu.size();i++){
            System.out.println(MainPage.TripNavigationMenu.get(i).getText());
        }
 }

 public static void selectFlightFrom(WebDriver driver,int i ){
         MainPage.FlightsFrom.get(i).click();

 }
// this function returns Language that user selected

    public static String SelectedText (WebElement element) {
     return   element.getText();
    }


  }



