package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends Components {

    @FindBy(xpath = "//a[@class='account' and contains(@href, 'controller=my-account')]")
    private WebElement profileName;

    @FindBy(className = "logout")
    private WebElement sigOutButton;

    @FindBy(className = "login")
    private WebElement signInButton;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public void clickSignOutButton() {
        waitUntilElementIsClickable(sigOutButton);
        sigOutButton.click();
    }

    public String getProfileNameFromHeader() {
        waitUntilElementIsClickable(profileName);
        return profileName.getText();
    }

    public void clickSignInButton() {
        waitUntilElementIsClickable(signInButton);
        signInButton.click();
    }
}
