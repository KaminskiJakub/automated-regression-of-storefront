package steps;

import components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import stepDefs.CommonStepDefs;

import static org.junit.Assert.assertEquals;

public class HeaderSteps {

    HeaderComponent headerComponent;
    private final WebDriver driver;

    public HeaderSteps(CommonStepDefs commonStepDefs) {
        this.driver = commonStepDefs.getDriver();
        headerComponent = new HeaderComponent(driver);
    }

    public void signOut() {
        headerComponent.clickSignOutButton();
    }

    public void checkProfileName(String profileName) {
        assertEquals(headerComponent.getProfileNameFromHeader(), profileName);
    }

    public void goToSignInSection() {
        headerComponent.clickSignInButton();
    }
}
