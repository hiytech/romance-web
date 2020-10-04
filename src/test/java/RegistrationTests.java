import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class RegistrationTests extends BaseUI {
    boolean selectedCheckbox;


    @Test
    public void testRegistration() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        WebElement checkBoxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        selectedCheckbox = checkBoxConfirmation.isSelected();
        System.out.println(selectedCheckbox + " !!!!!!!");
        if (!selectedCheckbox) {
            checkBoxConfirmation.click();
        }
        System.out.println("Checkbox is selected");
    }
}
