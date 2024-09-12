package pageObjects.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Base;

import java.util.List;

public class HomePagePhpTravels extends Base {

    @FindBy(xpath = "//li[@class='nav-item']/button/span")
    public List<WebElement>TripNavigationMenu;


 @FindBy(xpath ="//div[@class='most--popular-from']/div/div/div/small[@class='d-inline-block overflow-hidden airport--name" )
    public List<WebElement>FlightingFromList;

    @FindBy(xpath ="//button[@class='btn btn-outline-primary btn-sm mx-0']" )
    public List<WebElement> FlightsFrom;

    @FindBy(xpath = "//li[@class='nav-item dropdown']/a/strong[contains(text(),'USD')]")
    public WebElement CurrencyBox;


    @FindBy(xpath = "//div[@class='form-floating']")
    public WebElement FlightFromBox;

    @FindBy(xpath = "//ul[@class='dropdown-menu bg-white rounded-3 p-2 show']/li")
    public  List<WebElement> LanguageList;


}
