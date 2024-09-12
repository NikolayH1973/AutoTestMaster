package pageObjects.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Base;

import java.util.List;

public class NavbarSupportedContend extends Base {


    @FindBy(xpath = "//img[@class='logo p-1 rounded']")
    public WebElement HomeLogo;

    @FindBy(xpath = "//ul[@class='header_menu navbar-nav']/li/a")
    public List<WebElement> LeftMenuItems;

    @FindBy(xpath = "//div[@class='nav-item--right']/ul/li/a/strong[contains(text(), 'English')]")
    public WebElement LanguageTab;

    public WebElement langElement(String lang){
        return driver.findElement(By.xpath("//span[text()='LangSelect']".replace("LangSelect",lang)));
    }

    @FindBy(xpath = "//li[@class='nav-item dropdown']/a/strong[contains(text(),'USD')]")
    public WebElement CurrencyBox;

    public WebElement CurrencyElement(String CurrencyType){
        return driver.findElement(By.xpath("//strong[text()='Currency']".replace("Currency",CurrencyType)));
    }

    @FindBy(xpath = "//ul[@class='navbar-nav gap-2 me-auto mb-2 mb-lg-0']/li[3]")
    public WebElement AccountBox;

    public WebElement SignType(String SignType){
        return driver.findElement(By.xpath("//strong[text()='SignType']".replace("SignType",SignType)));
    }


    /// //ul[@class='dropdown-menu bg-white rounded-3 p-2 show']/li/a/small/strong
}
