import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HowWeWorkPage extends BaseActions {

    public HowWeWorkPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlHow;

    public void clickHowWeWorkPage(){
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
    }

    public void verifyHowWeWorkLink(){
        currentUrlHow = driver.getCurrentUrl();
        System.out.println(currentUrlHow);
        Assert.assertEquals(currentUrlHow, Data.expectedUrlHowWeWork);
    }

}