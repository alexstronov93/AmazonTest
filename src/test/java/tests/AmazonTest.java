package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    private final static String SEARCH_WORD = "PS4";
    private final static String EXPECTED_AMOUNT_OF_PRODUCTS = "1";
    private final static String EXPECTED_HEADING = "Amazon Privacy Notice";
    private final static String AMOUNT_OF_GIFT = "1000";
    private final static String EMAIL_FOR_RECIPIENT = "example@gmail.com";
    private final static String YOUR_NAME = "Alex";
    private final static String MESSAGE = "HAPPY BIRTHDAY";
    private final static String QUANTITY = "2";
    private final static String EXPECTED_AMOUNT_OF_CARDS = "2";
    private final static String NEW_QUANTITY = "5";
    private final static String AMOUNT_AFTER_DELETE = "0";

    @Test
    public void searchPS4() {
        getHomePage().search(SEARCH_WORD);
        getHomePage().clickSearchButton();
        getBasePage().implicityWait(20);
        getSearchResultPage().clickPS4SideBarMenu();
        Assert.assertTrue(getSearchResultPage().checkThatTextExist());
    }

    @Test
    public void sortByLowToHigh() {
        getHomePage().search(SEARCH_WORD);
        getHomePage().clickSearchButton();
        getBasePage().implicityWait(20);
        getSearchResultPage().clickPS4SideBarMenu();
        getSearchResultPage().clickSortLowToHigh();
        Assert.assertTrue(getSearchResultPage().checkThatFifa17Exist());
    }

    @Test
    public void sortByAVG() {
        getHomePage().search(SEARCH_WORD);
        getHomePage().clickSearchButton();
        getBasePage().implicityWait(20);
        getSearchResultPage().clickPS4SideBarMenu();
        getSearchResultPage().clickAVGSort();
        Assert.assertTrue(getSearchResultPage().checkThatPS4Exist());

    }

    @Test
    public void addToCartProduct() {
        getHomePage().clickVideoGamesMenu();
        getBasePage().implicityWait(20);
        getVideoGamesPage().clickPlayStationMenu();
        getPlayStationPage().clickAddToCart();
        getBasePage().waitForPageReadyState(30);
        Assert.assertEquals(getHomePage().getAmountOfProductCart(), EXPECTED_AMOUNT_OF_PRODUCTS);
    }

    @Test
    public void changeAmountInCart() {
        getHomePage().clickVideoGamesMenu();
        getBasePage().implicityWait(20);
        getVideoGamesPage().clickPlayStationMenu();
        getPlayStationPage().clickAddToCart();
        getPlayStationPage().clickCartButton();
        getCartPage().clickDropMenu();
        getCartPage().changeQuantity();
        getBasePage().waitForPageReadyState(30);
        Assert.assertEquals(getHomePage().getAmountOfProductCart(), NEW_QUANTITY);

    }

    @Test
    public void deleteProductFromCart() {
        getHomePage().clickVideoGamesMenu();
        getBasePage().implicityWait(20);
        getVideoGamesPage().clickPlayStationMenu();
        getPlayStationPage().clickAddToCart();
        getPlayStationPage().clickCartButton();
        getCartPage().clickDelete();
        getBasePage().waitForPageReadyState(30);
        Assert.assertEquals(getHomePage().getAmountOfProductCart(), AMOUNT_AFTER_DELETE);
    }

    @Test
    public void addToCartGiftCard() {
        getHomePage().clickGiftCardsMenu();
        getGiftCardsPage().clickEGiftCardMenu();
        getEGiftCardPage().choseCard();
        getEGiftCardPage().enterAmount(AMOUNT_OF_GIFT);
        getEGiftCardPage().enterEmail(EMAIL_FOR_RECIPIENT);
        getEGiftCardPage().enterYourName(YOUR_NAME);
        getEGiftCardPage().enterMessage(MESSAGE);
        getEGiftCardPage().enterQuantity(QUANTITY);
        getEGiftCardPage().clickAddToCart();
        getBasePage().waitForPageReadyState(30);
        Assert.assertEquals(getHomePage().getAmountOfProductCart(), EXPECTED_AMOUNT_OF_CARDS);
    }

    @Test
    public void checkPrivacyNotice() {
        getHomePage().scrollToBottom();
        getHomePage().clickPrivacyNoticeMenu();
        Assert.assertEquals(getPrivacyNoticePage().getText(), EXPECTED_HEADING);
    }
}
