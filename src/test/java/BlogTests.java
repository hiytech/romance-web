import org.testng.annotations.Test;

public class BlogTests extends BaseUI {

    @Test
    public void testBlogPage() {
        blogPage.clickBlogPage();
        blogPage.verifyBlogPageLink();
    }
}
