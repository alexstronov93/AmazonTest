package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private WebElement signIn;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@class='nav-input']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@aria-label='Video Games']")
    private WebElement videoGamesMenu;

    @FindBy(xpath = "//a[@class='nav_a' and contains(text(),'Privacy Notice')]")
    private WebElement privacyNoticeMenu;

    @FindBy(xpath = "//div[@id='nav-xshop']/a[3]")
    private WebElement giftCardsMenu;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement countProductInCart;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInMenu() {
        signIn.click();
    }

    public void search(String value) {
        searchField.clear();
        searchField.sendKeys(value);

    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickVideoGamesMenu() {
        videoGamesMenu.click();
    }

    public void scrollToBottom() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickPrivacyNoticeMenu() {
        privacyNoticeMenu.click();
    }

    public void clickGiftCardsMenu() {
        giftCardsMenu.click();
    }

    public String getAmountOfProductCart() {
        return countProductInCart.getText();
    }

}
