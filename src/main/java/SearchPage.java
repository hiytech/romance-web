import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SearchPage extends BaseActions {

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlSearch;
    String searchPageTitle;

    public void clickSearchPage(){
        driver.findElement(Locators.LINK_SEARCH).click();
    }

    public void verifySearchPageLink(){
        currentUrlSearch = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
    }

    public void getSearchPageTitle(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchPageTitle = driver.findElement(Locators.SEARCH_TITLE).getText();
        System.out.println(currentUrlSearch + " -- With a Page Title: " + searchPageTitle);
    }

    public void selectSearchPageDropDownData(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_BUTTON));
        getDropDownListByValue(Locators.DROP_DOWN_AGE_MIN, "35");
        getDropDownListByValue(Locators.DROP_DOWN_AGE_MAX, "55");
        driver.findElement(Locators.SEARCH_BUTTON).submit();
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Views");
    }


}
