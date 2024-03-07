import org.testng.annotations.Test;

public class SignInUpTest extends Base{

    @Test (enabled = false)
    public void signIn(){
        SignInPage signIn = new SignInPage(driver);
        signIn.emailPassword(emailId, passwordKeys);
    }

    @Test (enabled = false)
    public void signUp(){
        SignUpPage signUp = new SignUpPage(driver);
        signUp.clickOnSignUp();
        signUp.signUpForm();
    }

    @Test (enabled = false)
    public void sites(){
        SitesPage sitesObj = new SitesPage(driver);
        sitesObj.goToSites();
    }
}
