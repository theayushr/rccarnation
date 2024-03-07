import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignInPage extends Locators{
    public SignInPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void emailPassword(String emailId, String passwordKeys){
        waitAndSendKeys(email, emailId);
        waitAndSendKeys(password, passwordKeys);
        waitAndClick(submit);
    }

    public void invalidCredential(){
        waitForVisibility(toast);
        String errorMessage = toast.getText();

        Assert.assertEquals(errorMessage,expectedMsg);
    }
}
