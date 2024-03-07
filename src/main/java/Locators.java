import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Abstract{

    public Locators(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    /*------------------------------------- SignInPage -------------------------------------------------------------*/
    @FindBy(xpath = "//form/div[1]//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//form/div[2]//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//form/button[@type='submit']")
    WebElement submit;
    @FindBy(css = "#notistack-snackbar")
    WebElement toast;

    String expectedMsg = "Invalid credential";


    /*------------------------------------- SignUpPage -------------------------------------------------------------*/

    @FindBy (xpath = "//button[text()='Sign Up']")
    WebElement signUp;
    @FindBy (css = "#fName")
    WebElement firstName;
    @FindBy(css = "#lName")
    WebElement lastName;
    @FindBy (css = "#username")
    WebElement userName;
    @FindBy (xpath = "//div/div/div/input[@id='email']")
    WebElement emailId;
    @FindBy(xpath = "//div/div/div/input[@id='password']")
    WebElement passwordKeys;
    @FindBy(css = "#confirmPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@name='condition']")
    WebElement condition;
    @FindBy(xpath = "//input[@name='terms']")
    WebElement terms;
    @FindBy(xpath = "//button[text()='SUBMIT']")
    WebElement submitButton;


    /*------------------------------------- Timeline -------------------------------------------------------------*/

    @FindBy(css=".MuiBox-root.css-1pd48nx")
    WebElement header;

    @FindBy(css =".MuiBox-root.css-1tofv41")
    WebElement scrollHere;

    @FindBy(xpath = "//input[@id=':rc:']")
    WebElement commentx;
    @FindBy(xpath="//input[@id=\':rc:\']/parent::div/parent::div/parent::div/parent::div/parent::div/button")
    WebElement clickCommentx;

    @FindBy(css =".MuiTypography-root.MuiTypography-body1.css-cgchg7")
    WebElement clickPost;

    @FindBy(xpath = "//textarea[@placeholder='Write something here...']")
    WebElement post;

    @FindBy(css = ".css-1p363rr:nth-child(7)")
    WebElement fifthPost;


    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-8 MuiGrid-grid-lg-6 css-1ww0nhy']//div[3]")
    WebElement firstPost;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-8 MuiGrid-grid-lg-6 css-1ww0nhy']//div[5]/div[4]/div[1]/div/div/div/div[2]//input")
    WebElement comment;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-8 MuiGrid-grid-lg-6 css-1ww0nhy']//div[5]/div[4]/div[1]//button")
    WebElement clickComment;


    @FindBy(css= ".MuiTypography-root.MuiTypography-body1.css-g8njw2:nth-child(3)")
    WebElement choosePhoto;

    @FindBy(xpath = "//input[@type='file']")
    WebElement choosePhoto2;

    @FindBy(xpath = "//div[@class='MuiBox-root css-1ercywt']/input")
    WebElement typeFile;

    String imagePath = "/home/sysquare/Downloads/DroneImages/drone1.jpg";
    String videoPath = "/home/sysquare/Downloads/DroneImages/video2.mp4";


    @FindBy(xpath = "//*[@data-testid='LocationOnOutlinedIcon']")
    WebElement postLocation;

    @FindBy(css = "#autocomplete-text-box")
    WebElement myLocation;

    String himanchal = "Himanchal Pradesh";

    @FindBy(xpath = "//button[normalize-space()='Submit']") /* //body/div/div/div/div/button[2]*/
    WebElement submitLocation;

    @FindBy(xpath="//button[text()='Disagree']")
    WebElement disagree;

    @FindBy(xpath="//h2[text()='Choose Location']")
    WebElement clickOut;

    @FindBy(css = ".sc-bcPKhP.fJAWZC")
    WebElement blocker;

    @FindBy(css=".PrivateSwitchBase-input.css-1m9pwf3")
    WebElement checkbox;

    @FindBy(css = ".css-i0ctuz")
    WebElement nearCheckbox;

    @FindBy(xpath = "//p[text()='Long Range']")
    WebElement longRange;

    @FindBy(xpath = "//*[name()='path' and contains(@d,'M12 2C6.48')]")
    WebElement addMore;

    @FindBy(xpath = "//p[text()='Freestyle']")
    WebElement freestyle;


    @FindBy(xpath = "//button[text()='Create']")
    WebElement create;


    /*------------------------------------- SitesPage -------------------------------------------------------------*/

    @FindBy(css = ".MuiBox-root.css-nmesme:nth-child(2)")
    WebElement location;



}
