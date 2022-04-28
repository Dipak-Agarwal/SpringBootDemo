package com.example.SpringAuto.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainPage extends BasePage {

    public MainPage() {
        System.out.println("Main Page Class");
    }

    @Autowired
    private LoginPage loginpage;

    @Autowired
    private HomePage homePage;

//    @Autowired
//    private WebDriver webDriver;

    public void performLogin(){
//        webDriver.navigate().to("http://eaapp.somee.com");
        homePage.clickLoginLink();
        loginpage.enterCredentials("admin","password");
        loginpage.clickOnLoginButton();
    }
}
