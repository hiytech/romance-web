import org.testng.annotations.Test;

public class GiftsTests extends BaseUI {

    @Test
    public void testGiftsPage() {
        giftsPage.clickGiftsPage();
        giftsPage.verifyGiftsPageLink();
    }
}
