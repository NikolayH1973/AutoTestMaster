package pageObjects.Phptravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnglishLoginPage {
    @FindBy(xpath = "//div[@class='content mb-0 p-3 p-md-4']/h3/strong")
    public WebElement LoginHeader;
}
