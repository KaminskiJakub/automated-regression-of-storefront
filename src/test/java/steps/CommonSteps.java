package steps;

import org.openqa.selenium.WebDriver;
import stepDefs.CommonStepDefs;

import static org.junit.Assert.assertEquals;

public class CommonSteps {

    private final WebDriver driver;

    public CommonSteps(CommonStepDefs commonStepDefs) {
        this.driver = commonStepDefs.getDriver();
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public String getCurrentPageUrl() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.getCurrentUrl();
    }

    public void checkIfUserIsOnSpecificPage(String specificPage) {
        assertEquals(specificPage, getCurrentPageUrl());
    }
}
