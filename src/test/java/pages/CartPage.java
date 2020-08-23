package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    private WebElement dropMenu;

    @FindBy(xpath = "//a[@id='dropdown1_5']")
    private WebElement choseFiveElements;

    @FindBy(xpath = "//input[@data-action='delete']")
    private WebElement deleteButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickDropMenu() {
        dropMenu.click();
    }

    public void changeQuantity() {
        choseFiveElements.click();
    }

    public void clickDelete() {
        deleteButton.click();
    }

}
