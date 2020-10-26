import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI {

    @Test
    public void testHowWeWorkPage() {
        howWeWorkPage.clickHowWeWorkPage();
        howWeWorkPage.verifyHowWeWorkLink();
    }
}
