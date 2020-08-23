package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//span[@class='a-size-base a-color-base' and contains(text(),'PlayStation 4  Consoles')]")
    private WebElement ps4SideBarMenu;

    @FindBy(xpath = "//span[@dir='auto' and contains(text(),'PlayStation 4  Consoles')]")
    private WebElement ps4Text;

    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    private WebElement sortButton;

    @FindBy(xpath = "//a[@id='s-result-sort-select_1']")
    private WebElement lowToHighButton;

    @FindBy(xpath = "//a[@id='s-result-sort-select_3']")
    private WebElement avgCustomerReviewButton;

    @FindBy(xpath = "//span[@dir='auto' and contains(text(), 'Third Party - Fifa 17 Occasion [ PS4 ] - 5035228116375')]")
    private WebElement fifa17element;
    @FindBy(xpath = "//span[@dir='auto' and contains(text(),'PS4 - Konsole Black 1TB')]")
    private WebElement ps4Element;


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkThatTextExist() {
        if (ps4Text.isDisplayed()) {
            return true;
        } else return false;
    }

    public boolean checkThatFifa17Exist() {
        if (fifa17element.isDisplayed()) {
            return true;
        } else return false;
    }

    public boolean checkThatPS4Exist() {
        if (ps4Element.isDisplayed()) {
            return true;
        } else return false;
    }


    public void clickPS4SideBarMenu() {
        ps4SideBarMenu.click();
    }

    public void clickSortLowToHigh() {
        sortButton.click();
        lowToHighButton.click();
    }

    public void clickAVGSort() {
        sortButton.click();
        avgCustomerReviewButton.click();
    }

}
