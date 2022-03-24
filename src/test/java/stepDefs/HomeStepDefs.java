package stepDefs;

import io.cucumber.java.en.Given;
import steps.CommonSteps;
import utils.Constants;

public class HomeStepDefs {

    CommonSteps commonSteps;

    public HomeStepDefs(CommonSteps commonSteps) {
        this.commonSteps = commonSteps;
    }

    @Given("I am on home page")
    public void i_am_on_home_page() {
        commonSteps.goToUrl(Constants.HOME_PAGE_URL);
    }
}
