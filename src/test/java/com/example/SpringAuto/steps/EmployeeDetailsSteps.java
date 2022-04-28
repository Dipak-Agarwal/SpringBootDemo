package com.example.SpringAuto.steps;

import com.example.SpringAuto.models.TestUserDetails;
import com.example.SpringAuto.models.UserDetails;
import com.example.SpringAuto.pages.EmployeeDetailsPage;
import com.example.SpringAuto.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class EmployeeDetailsSteps {

    @Autowired
    private HomePage homePage;

    @Autowired
    private EmployeeDetailsPage employeeDetailsPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @When("the user extracts the information of the first employee on the employee details page")
    public void theUserExtractsTheInformationOfTheFirstEmployeeOnTheEmployeeDetailsPage() {
        homePage.clickEmployeeDetailsLink();
        testUserDetails.setUserDetails(new UserDetails(employeeDetailsPage.findNameOfFirstEmployee(), employeeDetailsPage.findSalaryOfFirstEmployee()));
    }

    @Then("the salary of that employee should be increased by {int} on the employee details page")
    public void theSalaryOfThatEmployeeShouldBeIncreasedByOnTheEmployeeDetailsPage(int salaryIncrease) {
        homePage.clickEmployeeDetailsLink();
        Assert.assertEquals(employeeDetailsPage.findSalaryOfFirstEmployee(), testUserDetails.getUserDetails().getSalary()+salaryIncrease);
    }
}
