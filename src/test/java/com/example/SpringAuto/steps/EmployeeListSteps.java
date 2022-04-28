package com.example.SpringAuto.steps;

import com.example.SpringAuto.models.TestUserDetails;
import com.example.SpringAuto.pages.EmployeeListPage;
import com.example.SpringAuto.pages.HomePage;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeListSteps {

    @Autowired
    private HomePage homePage;

    @Autowired
    private EmployeeListPage employeeListPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @And("the user increases the salary of that employee by {int}")
    public void theUserIncreasesTheSalaryOfThatEmployeeBy(int salaryIncrease) {
        homePage.clickEmployeeListLink();
        employeeListPage.searchForAnEmployeeUsingName(testUserDetails.getUserDetails().getName());
        employeeListPage.clickOnTheEditButtonForFirstRecord();
        employeeListPage.changeSalaryOfEmployee(testUserDetails.getUserDetails().getSalary() + salaryIncrease);
    }
}
