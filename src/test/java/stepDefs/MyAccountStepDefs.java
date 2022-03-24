package stepDefs;

import io.cucumber.java.en.Then;
import steps.CommonSteps;
import steps.HeaderSteps;
import utils.Constants;

public class MyAccountStepDefs {

    CommonSteps commonSteps;
    HeaderSteps headerSteps;

    public MyAccountStepDefs(CommonSteps commonSteps, HeaderSteps headerSteps) {
        this.commonSteps = commonSteps;
        this.headerSteps = headerSteps;
    }

    @Then("I am on my account page as a logged in user")
    public void i_am_on_my_account_page_as_a_logged_in_user() {
        commonSteps.checkIfUserIsOnSpecificPage(Constants.getMyAccountUrl());
        headerSteps.checkProfileName(Constants.PROFILE_NAME);
    }
}
