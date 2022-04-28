package com.example.SpringAuto.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Hooks {

    @Autowired
    private WebDriver driver;

//    @Autowired
//    private ApplicationContext applicationContext;

    @Value("${app.url}")
    private String appUrl;

    @Before
    public void initializeTest(Scenario scenario){
        driver.navigate().to(appUrl);
    }

    @After
    public void tearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            //Screenshot logic
            System.out.println(scenario.getName());
        }
//        this.applicationContext.getBean(WebDriver.class).quit();
        // Comment the below line for sequential execution
        driver.quit();
    }

}
