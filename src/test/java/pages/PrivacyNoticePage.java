package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyNoticePage extends BasePage {

    @FindBy(xpath = "//div[@class='help-content']/h1")
    private WebElement heading;

    public PrivacyNoticePage(WebDriver driver) {
        super(driver);
    }

    public String getText(){
        return heading.getText();
    }

}
