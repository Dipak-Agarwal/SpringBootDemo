package com.example.SpringAuto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoginPage extends BasePage {

    public LoginPage() {
        System.out.println("Login Page Class");
    }

    @FindBy(how= How.NAME, using="UserName")
    private WebElement textBox_Username;

    @FindBy(how= How.NAME, using="Password")
    private WebElement textBox_Password;

    @FindBy(how= How.CSS, using=".btn-default")
    private WebElement button_Login;

    public void enterCredentials(String username, String password){
        textBox_Username.sendKeys(username);
        textBox_Password.sendKeys(password);
        System.out.println("Entered username as "+username+" and password as "+password);
    }

    public HomePage clickOnLoginButton(){
        button_Login.click();
        System.out.println("Clicked on login button");
        return new HomePage();
    }


}
