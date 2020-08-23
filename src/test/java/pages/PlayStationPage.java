package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlayStationPage extends BasePage {

    @FindBy(xpath = "//span[@dir='auto' and contains(text(),'DualShock 4 Wireless Controller for PlayStation 4 - Jet Black')]")
    private WebElement dualShockController;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
    private WebElement cartMenuButton;


    public PlayStationPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCart() {
        dualShockController.click();
        addToCartButton.click();
    }

    public void clickCartButton() {
        cartMenuButton.click();
    }

}
