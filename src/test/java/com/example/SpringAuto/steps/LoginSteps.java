package com.example.SpringAuto.steps;

import com.example.SpringAuto.models.TestUserDetails;
import com.example.SpringAuto.pages.HomePage;
import com.example.SpringAuto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.util.Map;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @When("the user enters the following for login")
    public void theUserEntersTheFollowingForLogin(DataTable dataTable) {
        var rows = dataTable.asMaps();
        for(Map<String, String> columns : rows){
            loginPage.enterCredentials(columns.get("username"), columns.get("password"));
        }
    }

    @And("the user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("the user should navigate to the home page as a logged in user")
    public void theUserShouldNavigateToTheHomePageAsALoggedInUser() {
        Assert.assertEquals(homePage.isEmployeeDetailsLinkExist(), true);
    }


    @Given("the user clicks on login link on the home page")
    public void theUserClicksOnLoginLinkOnTheHomePage() {
        homePage.clickLoginLink();
    }
}
