package com.example.SpringAuto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeListPage extends BasePage {

    //td[contains(text(),'sandhya')]/following-sibling::td[contains(text(),'4000')]/following-sibling::td/a[text()='Edit']
    @FindBy(how= How.NAME, using="searchTerm")
    private WebElement textBox_Search;

    @FindBy(how= How.XPATH, using="//input[@value='Search']")
    private WebElement button_Search;

    @FindBy(how= How.XPATH, using="//table[@class='table']//tr[2]//a[text()='Edit']")
    private WebElement button_Edit_FirstRecord;

    @FindBy(how= How.ID, using="Salary")
    private WebElement textBox_Salary;

    @FindBy(how= How.XPATH, using="//input[@value='Save']")
    private WebElement button_Save;

    public void searchForAnEmployeeUsingName(String name){
        textBox_Search.sendKeys(name);
        button_Search.click();
    }

    public void clickOnTheEditButtonForFirstRecord(){
        button_Edit_FirstRecord.click();
    }

    public void changeSalaryOfEmployee(int updatedSalary){
        textBox_Salary.clear();
        textBox_Salary.sendKeys(String.valueOf(updatedSalary));
        button_Save.click();
    }
}
