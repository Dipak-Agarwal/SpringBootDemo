package com.example.SpringAuto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeDetailsPage extends BasePage{

    @FindBy(how= How.XPATH, using = "//table[@class='table']//tr[2]/td[1]")
    private WebElement text_firstEmployeeName;

    @FindBy(how= How.XPATH, using = "//table[@class='table']//tr[2]/td[2]")
    private WebElement text_firstEmployeeSalary;

    public String findNameOfFirstEmployee(){
        return  text_firstEmployeeName.getText().trim();
    }

    public int findSalaryOfFirstEmployee(){
        return  Integer.parseInt(text_firstEmployeeSalary.getText().trim());
    }

}
