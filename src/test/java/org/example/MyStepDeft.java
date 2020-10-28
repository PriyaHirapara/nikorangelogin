package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepDeft extends Util {
    //Crate Object Of LogInPage
    LogInPage logInPage = new LogInPage();
    //Crate Object Of LogInSuccessfully
    LogInSuccessfully logInSuccessfully = new LogInSuccessfully();

    @Given("^user is on login page$")
    public void user_is_on_login_page()
    {
        logInPage.verifyUserIsOnLoginPage();
    }
    @When("^user enter valid username and password$")
    public void user_enter_valid_username_and_password() {
        logInPage.userEntersLoginDetails();
    }
    @When("^user click on Login button$")
    public void user_click_on_Login_button()  {
       logInPage.clickOnLoginButton();
    }
    @Then("^user should be login successfully$")
    public void user_should_be_login_successfully()  {
        logInSuccessfully.verifyUserLoginSuccessfully();
    }
    @When("^user enter invalid and empty user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enter_invalid_and_empty_user_name_and_password(String username, String password)  {

        logInPage.userEnterUserNameAndPassword(username,password);
    }
    @Then("^user should be login not successfully and user should see error message \"([^\"]*)\"$")
    public void user_should_be_login_not_successfully_and_user_should_see_error_message(String errorMessage) {

        logInPage.userLoginNotSuccess(errorMessage);
    }
}
