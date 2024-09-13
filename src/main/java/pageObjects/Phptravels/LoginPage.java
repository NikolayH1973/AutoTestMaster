package pageObjects.Phptravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Base;

import javax.xml.xpath.XPath;

public class LoginPage extends Base {

    @FindBy(xpath = "//div[@class='form-floating mb-3']/input[@name='email']")
    public WebElement txt_email;

    @FindBy(xpath = "//div[@class='form-floating mb-3']/input[@name='password']")
    public WebElement txt_password;

    @FindBy(xpath = "//div[@class='d-flex align-items-center justify-content-between mb-3']/div/input")
    public WebElement checkbox_RememberMe;

    @FindBy(xpath = "//div[@class='login_button']/button[@id='submitBTN']")
    public WebElement LoginButton;
}
