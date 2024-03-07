import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
    WebDriver driver;

    @BeforeMethod
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod (dependsOnMethods = "setDriver")
    public void goToPage(){
        String website = "https://rccarnation.net/bn-web/login";
        driver.get(website);
    }

    @BeforeMethod (dependsOnMethods = "goToPage")
    public void signMeIn(){
        SignInPage signIn = new SignInPage(driver);
        signIn.emailPassword(emailId,passwordKeys);
    }

    @AfterMethod (enabled = false)
    public void closePage(){
        driver.quit();
    }


    /*------------------------------------- Values -------------------------------------------------------------*/
    String emailId = "useray3338@mailinator.com";
    String passwordKeys = "12345678";
}
