import org.openqa.selenium.By;

public class Locators {

    // Main page
    public static final By IFRAME = By.xpath("//iframe");
    public static final By IFRAME_PLAY_BUTTON = By.cssSelector("button.ytp-large-play-button.ytp-button");

    // Blog page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

    // Gifts page
    public static final By LINK_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");

    // How We Work page
    public static final By LINK_HOW_WE_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    // Media page
    public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");

    // Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By CHECKBOX_CONFIRMATION = By.cssSelector("input#confirmation");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("input#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");

    // Search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By SEARCH_TITLE = By.xpath("//h1[@class='title']");
    public static final By DROP_DOWN_AGE_MIN = By.xpath("//div[@class='col-xs-5 no-padding-left']//select");
    public static final By DROP_DOWN_AGE_MAX = By.xpath("//div[@class='col-xs-5 no-padding-right']//select");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By SEARCH_BUTTON = By.xpath("//input[@id='main_search_button_user_advanced']");

    // Tour page
    public static final By LINK_TOUR = By.xpath("//a[@class='nav-link '][@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");




}
