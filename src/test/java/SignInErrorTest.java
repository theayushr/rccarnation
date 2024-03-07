import org.testng.annotations.Test;

public class SignInErrorTest extends Base{

    @Test
    public void wrongEmail(){
        SignInPage signIn = new SignInPage(driver);

        String email = "useay3333@mailinator.com";
        String password = "12345678";

        signIn.emailPassword(email, password);
        signIn.invalidCredential();
    }

    @Test (dependsOnMethods = "wrongEmail")
    public void wrongPassword(){

        SignInPage signIn = new SignInPage(driver);

        String email = "useay3338@mailinator.com";
        String password = "123456789";

        signIn.emailPassword(email, password);
        signIn.invalidCredential();
    }
}
