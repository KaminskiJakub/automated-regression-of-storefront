package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends Components {

    @FindBy(xpath = "//a[@class='account' and contains(@href, 'controller=my-account')]")
    public WebElement profileName;

    @FindBy(className = "logout")
    public WebElement sigOutButton;

    @FindBy(className = "login")
    public WebElement signInButton;

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
