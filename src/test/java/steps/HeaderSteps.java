package steps;

import components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import stepDefs.CommonStepDefs;

import static org.junit.Assert.assertEquals;

public class HeaderSteps {

    HeaderComponent headerComponent;
    private LoginSteps loginSteps;
    private final WebDriver driver;

    public HeaderSteps(CommonStepDefs commonStepDefs) {
        this.driver = commonStepDefs.getDriver();
        headerComponent = new HeaderComponent(driver);
    }

    public void signOut() {
        headerComponent.clickSignOutButton();
    }

    public HeaderSteps checkProfileName(String profileName) {
        assertEquals(headerComponent.getProfileNameFromHeader(), profileName);
        return this;
    }

    public LoginSteps goToSignInSection() {
        headerComponent.clickSignInButton();
        return loginSteps;
    }
}
