package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

public class Components {

    protected WebDriver driver;
    private WebDriverWait wait;

    public Components(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement waitUntilElementIsClickable(WebElement webElement) {
        wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }
}
