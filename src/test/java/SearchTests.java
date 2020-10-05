import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseUI {
    String currentUrlSearch;
    String searchPageTitle;


    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchPageTitle = driver.findElement(Locators.SEARCH_TITLE).getText();
        System.out.println(currentUrlSearch + " -- With a Page Title: " + searchPageTitle);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
//        select.selectByIndex(3)
    }

    @Test
    public void testFindPeople() {
        driver.findElement(Locators.LINK_SEARCH).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_BUTTON));
        getDropDownListByValue(Locators.DROP_DOWN_AGE_MIN, "35");
        getDropDownListByValue(Locators.DROP_DOWN_AGE_MAX, "55");
        driver.findElement(Locators.SEARCH_BUTTON).submit();
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Views");
    }

}
