import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TourPage extends BaseActions {

    public TourPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlTour;

    public void clickTourPage(){
        driver.findElement(Locators.LINK_TOUR).click();
    }

    public void verifyTourPageLink(){
        currentUrlTour = driver.getCurrentUrl();
        System.out.println(currentUrlTour);
        Assert.assertEquals(currentUrlTour, Data.expectedUrlTour);
    }

}