import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    @Test
    public void testTourPage() {
        tourPage.clickTourPage();
        tourPage.verifyTourPageLink();
    }
}
