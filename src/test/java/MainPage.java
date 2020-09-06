import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    WebDriverWait wait;
    String searchPageTitle;
    String emailTest = "sk@gmail.com";
    String passwordTest = "sdjn45k";
    String currentUrl;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedUrlHowWeWork = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlGifts = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlTour = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    By LINK_HOW_WE_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_TOUR = By.xpath("//a[@class='nav-link '][@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By FIELD_EMAIL = By.cssSelector("input#email");
    By FIELD_PASSWORD = By.cssSelector("input#password");
    By SEARCH_TITLE = By.xpath("//h1[@class='title']");
    WebElement signin_element;
    int indexLinkSignIn = 0;




    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testSearchPage() {
        driver.findElement(LINK_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title']")));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='title']")));
//        String searchPageTitle = driver.findElement(By.xpath("//h1[@class='title']")).getText();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        searchPageTitle = driver.findElement(SEARCH_TITLE).getText();
        System.out.println(currentUrl + " -- With a Page Title: " + searchPageTitle);
        Assert.assertEquals(currentUrl, expectedUrlSearch);
    }

    @Test
    public void testMediaPage() {
        driver.findElement(LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlMedia);
    }

    @Test
    public void testHowWeWorkPage() {
        driver.findElement(LINK_HOW_WE_WORK).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlHowWeWork);
    }

    @Test
    public void testGiftsPage() {
        driver.findElement(LINK_GIFTS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlGifts);
    }

    @Test
    public void testTourPage() {
        driver.findElement(LINK_TOUR).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlTour);
    }

    @Test
    public void testBlogPage() {
        driver.findElement(LINK_BLOG).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlBlog);
    }

    @Test
    public void testSignIn() {
//        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
        signin_element = driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn);
        signin_element.click();

    }

    @Test
    public void testRegistration() {
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(FIELD_EMAIL).sendKeys(emailTest);
        driver.findElement(FIELD_PASSWORD).sendKeys(passwordTest);
    //    driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();

    }

    @AfterMethod
    public void afterActions() {

        // driver.quit();
    }

}
