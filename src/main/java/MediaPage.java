import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MediaPage extends BaseActions {

    public MediaPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlMedia;

    public void clickMediaPage(){
        driver.findElement(Locators.LINK_MEDIA).click();
    }

    public void verifyMediaPageLink(){
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
    }
}