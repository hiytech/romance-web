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
    public void testFindPeople() throws InterruptedException {
        driver.findElement(Locators.LINK_SEARCH).click();
        Thread.sleep(2000);
        getDropDownListByValue(Locators.DROP_DOWN_AGE_MIN, "19");
        getDropDownListByValue(Locators.DROP_DOWN_AGE_MAX, "39");
        driver.findElement(Locators.SEARCH_BUTTON).submit();
        Thread.sleep(4000);
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Views");
    }

}
