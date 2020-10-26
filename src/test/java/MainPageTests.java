import org.testng.annotations.Test;

public class MainPageTests extends BaseUI {

    @Test
    public void iframeTest() {
        mainPage.switchToiFrameVideo();
    }
}
