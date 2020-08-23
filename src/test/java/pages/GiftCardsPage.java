package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardsPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='eGift']")
    private WebElement eGiftCardMenu;


    public GiftCardsPage(WebDriver driver) {
        super(driver);
    }

    public void clickEGiftCardMenu() {
        eGiftCardMenu.click();
    }
}
