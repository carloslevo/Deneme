package com.CRMLY.stepdefinitions;

import com.CRMLY.pages.LoginPage;
import com.CRMLY.utilities.ConfigurationReader;
import com.CRMLY.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteDefs {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User login as HR user")
    public void user_login_as_HR_user() {
        new LoginPage().loginAsHR();
    }

    @When("User login as Helpdesk user")
    public void user_login_as_Helpdesk_user() {
        new LoginPage().loginAsHelpdesk();
    }

    @When("User login as Marketing user")
    public void user_login_as_Marketing_user() {
        new LoginPage().loginAsMarketing();
    }

    @Then("User should see {string} as a title")
    public void user_should_see_as_a_title(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify title",expectedTitle,actualTitle);

    }


    @When("User login with {string} and {string}")
    public void user_login_with_and(String username, String password) {
        new LoginPage().login(username,password);

    }

    @Then("User should see {string} error message")
    public void user_should_see_error_message(String errorMessage) {
        Assert.assertEquals("Verify error message", errorMessage, new LoginPage().errorMessage.getText());
    }


}
