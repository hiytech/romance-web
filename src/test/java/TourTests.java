import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {
    String currentUrlTour;


    @Test
    public void testTourPage() {
        driver.findElement(Locators.LINK_TOUR).click();
        currentUrlTour = driver.getCurrentUrl();
        System.out.println(currentUrlTour);
        Assert.assertEquals(currentUrlTour, Data.expectedUrlTour);
    }
}
