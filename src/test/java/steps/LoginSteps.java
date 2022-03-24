package steps;

import components.LoginComponent;
import org.openqa.selenium.WebDriver;
import stepDefs.CommonStepDefs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    LoginComponent loginComponent;
    private final WebDriver driver;

    public LoginSteps(CommonStepDefs commonStepDefs) {
        this.driver = commonStepDefs.getDriver();
        loginComponent = new LoginComponent(driver);
    }

    public void signIn(String email, String password) {
        typeInEmailAndPasswordToRequiredFields(email, password);
        loginComponent.clickSubmitButton();
    }

    public void checkIfSignButtonIsDisabled() {
        assertFalse(loginComponent.checkIfSubmitButtonIsEnabled());
    }

    public void checkIfErrorMessageIsPresent() {
        assertTrue(loginComponent.isErrorTextDisplayed());
    }

    private void typeInEmailAndPasswordToRequiredFields(String email, String password) {
        loginComponent.typeEmailAddress(email);
        loginComponent.typePassword(password);
    }
}
