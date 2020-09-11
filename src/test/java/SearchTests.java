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
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title']")));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='title']")));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        searchPageTitle = driver.findElement(Locators.SEARCH_TITLE).getText();
        System.out.println(currentUrlSearch + " -- With a Page Title: " + searchPageTitle);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
    }
}
