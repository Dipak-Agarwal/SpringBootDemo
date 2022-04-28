package com.example.SpringAuto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public abstract class BasePage {

    public BasePage() {
        System.out.println("Base Page Class");
    }

    @Autowired
    private WebDriver driver;

    @PostConstruct
    public void initPages(){
        PageFactory.initElements(driver, this);
    }

    public void openUrl(String url){
        driver.navigate().to(url);
    }

}
