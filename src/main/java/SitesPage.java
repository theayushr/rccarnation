import org.openqa.selenium.WebDriver;

public class SitesPage extends Locators{

    public SitesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void goToSites(){
        waitAndClick(location);
    }

}
