import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Abstract {
    WebDriver driver;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    public void waitAndClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void justClick(WebElement element){
        element.click();
    }

    public void waitAndSendKeys(WebElement element, String keys){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(keys);
    }

    public void waitForVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void onlySendKeys(WebElement element, String keys){
        element.sendKeys(keys);
    }

    public void waitForInvisibility(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
