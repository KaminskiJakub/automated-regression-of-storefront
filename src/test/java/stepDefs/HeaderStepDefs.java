package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import steps.HeaderSteps;

public class HeaderStepDefs {

    HeaderSteps headerSteps;

    public HeaderStepDefs(HeaderSteps headerSteps) {
        this.headerSteps = headerSteps;
    }

    @And("I sign out")
    public void i_sign_out() {
        headerSteps.signOut();
    }

    @When("I go to sign in section")
    public void i_go_to_sign_in_section() {
        headerSteps.goToSignInSection();
    }
}
