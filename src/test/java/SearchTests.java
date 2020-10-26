import org.testng.annotations.Test;

public class SearchTests extends BaseUI {


    @Test
    public void testSearchPage() {
        searchPage.clickSearchPage();
        searchPage.verifySearchPageLink();
        searchPage.getSearchPageTitle();

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
        searchPage.clickSearchPage();
        searchPage.selectSearchPageDropDownData();
    }

}
