package extensions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verifications {
    public static void verifyTextInElement(WebElement element, String expected){
        Assert.assertEquals(element.getText(),expected);
    }
}
