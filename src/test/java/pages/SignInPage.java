package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@id='auth-error-message-box']")
    private WebElement alertMassage;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void signIn(String email) {
        emailField.clear();
        emailField.sendKeys(email);
        continueButton.click();
    }

    public boolean isError() {
        if (alertMassage.isDisplayed()) {
            return true;
        } else return false;
    }
}
