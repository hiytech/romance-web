import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    Actions action = new Actions(driver);
    boolean selectedCheckbox;
    WebElement iframe;

    public void clickJoinButton(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistration(){
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
    }

    public void completeSecondPartOfRegistration(){
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 10));
        driver.findElement(Locators.SELECT_DAY_DROP_DOWN).click();
        driver.findElement(Locators.SELECT_DAY_VALUE).click();
        driver.findElement(Locators.SELECT_MONTH_DROP_DOWN).click();
        driver.findElement(Locators.SELECT_MONTH_VALUE).click();
        driver.findElement(Locators.SELECT_YEAR_DROP_DOWN).click();
        driver.findElement(Locators.SELECT_YEAR_VALUE).click();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        WebElement checkBoxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        selectedCheckbox = checkBoxConfirmation.isSelected();
        System.out.println(selectedCheckbox + " !!!!!!!");
        if (!selectedCheckbox) {
            checkBoxConfirmation.click();
        }
        System.out.println("Checkbox is selected");
    }

    public void switchToiFrameVideo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.IFRAME));
        iframe = driver.findElement(Locators.IFRAME);
        driver.switchTo().frame(iframe);
        //driver.findElement(Locators.IFRAME_PLAY_BUTTON).click(); - simple click often doesn't work
        action.click(driver.findElement(Locators.IFRAME_PLAY_BUTTON)).perform();
    }

}