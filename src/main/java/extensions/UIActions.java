package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public  class UIActions extends CommonOps {

    // click on element on the page
    public static void click(WebElement element) {
        element.click();
        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
    }
// update and send value
    public static void updatetext(WebElement element, String txt) {
        element.sendKeys(txt);
    }

// this functions clicks on all main menu tabs
 public static void ClickOnMenuItems(List<WebElement> MenuItems){
        int i=0;
        for (i=0;i<MenuItems.size();i++){
            MenuItems.get(i).click();
            Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
        }
 }
// this functions prints all Menu Items
 public static void PrintMenuItems(List<WebElement> MenuItems){
     Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
     for(int i=0;i<MenuItems.size();i++){
         System.out.println(MenuItems.get(i).getText());
     }
 }


// Click on the Flight from Box in order to display the flight company list
 public static void selectFlightFrom(WebDriver driver,int i ){
         MainPage.FlightsFrom.get(i).click();

 }
// this function returns text that user selected in list
    public static String SelectedText (WebElement element) {
     return   element.getText();
    }

  }



