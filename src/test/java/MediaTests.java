import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    @Test
    public void testMediaPage() {
        mediaPage.clickMediaPage();
        mediaPage.verifyMediaPageLink();
    }
}
