package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

public class LoginComponent {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement invalidEmailOrPasswordError;

    private final WebDriver driver;
    private WebDriverWait wait;

    public LoginComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement waitUntilElementIsClickable(WebElement webElement) {
        wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }

    public void typeEmailAddress(String emailAddress) {
        waitUntilElementIsClickable(emailField);
        emailField.sendKeys(emailAddress);
    }

    public void typePassword(String password) {
        waitUntilElementIsClickable(passwordField);
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        waitUntilElementIsClickable(signInButton);
        signInButton.click();
    }

    public boolean isErrorTextDisplayed() {
        return invalidEmailOrPasswordError.isDisplayed();
    }

    public boolean checkIfSubmitButtonIsEnabled() {
        return signInButton.isEnabled();
    }
}
