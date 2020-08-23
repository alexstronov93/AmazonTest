package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EGiftCardPage extends BasePage {

    @FindBy(xpath = "//button[@id='gc-customization-type-button-Animated']")
    private WebElement animatedButton;

    @FindBy(xpath = "//input[@class='a-input-text gc-order-form-custom-amount']")
    private WebElement amountOfGift;

    @FindBy(xpath = "//textarea[@id='gc-order-form-recipients']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='gc-order-form-senderName']")
    private WebElement senderNameField;

    @FindBy(xpath = "//textarea[@id='gc-order-form-message']")
    private WebElement messageField;

    @FindBy(xpath = "//input[@id='gc-order-form-quantity']")
    private WebElement quantityField;

    @FindBy(xpath = "//input[@id='gc-buy-box-atc']")
    private WebElement addToCartButton;


    public EGiftCardPage(WebDriver driver) {
        super(driver);
    }

    public void choseCard() {
        animatedButton.click();
    }

    public void enterAmount(String amount) {
        amountOfGift.clear();
        amountOfGift.sendKeys(amount);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterYourName(String name) {
        senderNameField.clear();
        senderNameField.sendKeys(name);
    }

    public void enterMessage(String message) {
        messageField.clear();
        messageField.sendKeys(message);
    }

    public void enterQuantity(String quantity) {
        quantityField.clear();
        quantityField.sendKeys(quantity);
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }
}
