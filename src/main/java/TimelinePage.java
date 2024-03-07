import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class TimelinePage extends Locators{

    public TimelinePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    public void goToPost() throws InterruptedException {
        Actions action = new Actions(driver);
        Thread.sleep(20000);
        action.scrollToElement(fifthPost).build().perform();
    }

    public void writeAComment() throws InterruptedException {
        Actions action = new Actions(driver);

        Thread.sleep(20000);
        waitAndClick(header);
        action.moveToElement(fifthPost).build().perform();
        waitAndSendKeys(comment,"autotest");
        waitAndClick(clickComment);
    }

    public void createPublicPost() throws InterruptedException {

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Execute JavaScript to clear cache
        jsExecutor.executeScript("window.localStorage.clear();");
        jsExecutor.executeScript("window.sessionStorage.clear();");
        jsExecutor.executeScript("window.indexedDB.deleteDatabase('firebaseLocalStorageDb');");

        Actions action = new Actions(driver);
        waitForVisibility(clickPost);
        action.scrollToElement(clickPost).build().perform();

        waitAndClick(clickPost);
        waitAndSendKeys(post,"automation test: video post");

        waitForVisibility(choosePhoto);
        onlySendKeys(typeFile,videoPath);

        waitAndClick(postLocation);

//        waitAndSendKeys(myLocation, himanchal);

//        Thread.sleep(5000);
//        action.keyDown(Keys.ARROW_DOWN).click().build().perform();

//        WebElement frame = driver.findElement(By.cssSelector("iframe[aria-hidden='true']"));
//        driver.switchTo().frame(frame);

//        submitLocation.sendKeys(Keys.TAB);
//        driver.switchTo().activeElement();
//        driver.switchTo().defaultContent();


//        if (submitLocation.equals(driver.switchTo().activeElement())) {
//            System.out.println("The element has focus");
//        } else {
//            System.out.println("The element does not have focus");
//        }

        Thread.sleep(2000);
        waitAndClick(submitLocation);
        action.scrollToElement(nearCheckbox);
        justClick(nearCheckbox);
        justClick(longRange);
        justClick(checkbox);
        waitAndClick(create);
    }

    public void createPrivatePost(){
        Actions action = new Actions(driver);
        waitForVisibility(clickPost);
        action.scrollToElement(clickPost).build().perform();

        waitAndClick(clickPost);

    }
}
