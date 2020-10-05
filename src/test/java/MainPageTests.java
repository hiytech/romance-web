import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class MainPageTests extends BaseUI {
    WebElement iframe;


    @Test
    public void iframeTest() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.IFRAME));
        iframe = driver.findElement(Locators.IFRAME);
        driver.switchTo().frame(iframe);
        //driver.findElement(Locators.IFRAME_PLAY_BUTTON).click(); - simple click often doesn't work
        action.click(driver.findElement(Locators.IFRAME_PLAY_BUTTON)).perform();

    }
}
