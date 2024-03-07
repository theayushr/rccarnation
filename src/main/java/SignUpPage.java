import org.openqa.selenium.WebDriver;

public class SignUpPage extends Locators{

    public SignUpPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public void clickOnSignUp(){
        waitAndClick(signUp);
    }
    public void signUpForm(){
        waitAndSendKeys(firstName, "TestFirstName");
        waitAndSendKeys(lastName,"TestLastName");
        waitAndSendKeys(userName, "test1234");
        waitAndSendKeys(emailId, "testrcc123421423@mailinator.com");
        waitAndSendKeys(passwordKeys, "12345678");
        waitAndSendKeys(confirmPassword, "12345678");

        justClick(condition);
        justClick(terms);

        waitAndClick(submitButton);
    }
}
