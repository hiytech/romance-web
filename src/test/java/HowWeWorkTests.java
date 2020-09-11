import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI {
    String currentUrlHow;


    @Test
    public void testHowWeWorkPage() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        currentUrlHow = driver.getCurrentUrl();
        System.out.println(currentUrlHow);
        Assert.assertEquals(currentUrlHow, Data.expectedUrlHowWeWork);
    }
}
