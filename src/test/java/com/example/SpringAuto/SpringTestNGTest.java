package com.example.SpringAuto;

import com.example.SpringAuto.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

@SpringBootTest
public class SpringTestNGTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver driver;

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private MainPage mainPage;

//    @BeforeTest
//    protected void setUpWebDriver(){
//        driver.navigate().to(appUrl);
//    }

    @Test
    public void testLogin(){
//        driver.navigate().to(appUrl);
        mainPage.openUrl(appUrl);
        mainPage.performLogin();
    }

    @AfterTest
    public void closeWebDriver(){
        driver.quit();
    }

    @BeforeSuite(alwaysRun = true)
    @BeforeClass(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }


}

