package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {
    private WebDriver driver;
    private static String AMAZON_URL = "https://www.amazon.com/";

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }


    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AMAZON_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public BasePage getBasePage() {
        return new BasePage(driver);
    }

    public SignInPage getSignInPage() {
        return new SignInPage(driver);
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(driver);
    }

    public VideoGamesPage getVideoGamesPage() {
        return new VideoGamesPage(driver);
    }

    public PlayStationPage getPlayStationPage() {
        return new PlayStationPage(driver);
    }

    public PrivacyNoticePage getPrivacyNoticePage() {
        return new PrivacyNoticePage(driver);
    }

    public GiftCardsPage getGiftCardsPage() {
        return new GiftCardsPage(driver);
    }

    public EGiftCardPage getEGiftCardPage() {
        return new EGiftCardPage(driver);
    }

    public CartPage getCartPage() {
        return new CartPage(driver);
    }
}
