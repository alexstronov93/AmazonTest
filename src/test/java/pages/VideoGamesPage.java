package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoGamesPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='PLAYSTATION']")
    private WebElement playStationMenu;

    public void clickPlayStationMenu() {
        playStationMenu.click();
    }


    public VideoGamesPage(WebDriver driver) {
        super(driver);
    }
}
