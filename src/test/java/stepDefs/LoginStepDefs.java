package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.CommonSteps;
import steps.LoginSteps;
import utils.Constants;

public class LoginStepDefs {

    CommonSteps commonSteps;
    LoginSteps loginSteps;

    public LoginStepDefs(CommonSteps commonSteps, LoginSteps loginSteps) {
        this.commonSteps = commonSteps;
        this.loginSteps = loginSteps;
    }

    @When("I sign in with my credentials on login page")
    public void i_sign_in_with_my_credentials_on_login_page() {
        commonSteps.checkIfUserIsOnSpecificPage(Constants.getLoginUrl());
        loginSteps.signIn(Constants.EMAIL, Constants.PASSWORD);
    }

    @And("^I sign in with wrong credentials: (.*) and (.*)$")
    public void i_sign_in_with_wrong_credentials(String email, String password) {
        loginSteps.signIn(email, password);
    }

    @Then("Sign in button is disabled and cannot be clicked")
    public void sign_in_button_is_disabled_and_cannot_be_clicked() {
        loginSteps.checkIfSignButtonIsDisabled();
    }

    @Then("there is error message present")
    public void there_is_error_message_present() {
        loginSteps.checkIfErrorMessageIsPresent();
    }

    @And("I am still on authentication page")
    public void iAmStillOnAuthenticationPage() {
        commonSteps.checkIfUserIsOnSpecificPage(Constants.getAuthenticationUrl());
    }

    @Then("I am on login page")
    public void iAmOnLoginPage() {
        commonSteps.checkIfUserIsOnSpecificPage(Constants.getLoginUrl());
    }
}
