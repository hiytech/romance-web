import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftsPage extends BaseActions {

    public GiftsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlGifts;

    public void clickGiftsPage(){
        driver.findElement(Locators.LINK_GIFTS).click();
    }

    public void verifyGiftsPageLink(){
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);
    }

}