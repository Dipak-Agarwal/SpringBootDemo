package com.example.SpringAuto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HomePage extends BasePage{

    public HomePage() {
        System.out.println("Home Page Class");
    }

    @FindBy(how= How.LINK_TEXT, using="Login")
    private WebElement link_Login;

    @FindBy(how=How.LINK_TEXT, using="Employee List")
    private WebElement link_EmployeeList;

    @FindBy(how=How.LINK_TEXT, using="Employee Details")
    private WebElement link_EmployeeDetails;

    public LoginPage clickLoginLink(){
        link_Login.click();
        System.out.println("click on Login link in home page");
        return new LoginPage();
    }

    public void clickEmployeeListLink(){
        link_EmployeeList.click();
    }

    public void clickEmployeeDetailsLink(){
        link_EmployeeDetails.click();
    }

    public boolean isEmployeeDetailsLinkExist(){
        return link_EmployeeDetails.isDisplayed();
    }

}
