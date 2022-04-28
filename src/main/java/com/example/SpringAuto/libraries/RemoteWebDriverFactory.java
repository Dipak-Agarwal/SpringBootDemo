package com.example.SpringAuto.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import java.net.URL;

@Configuration
@Profile("remote")
public class RemoteWebDriverFactory {

    @Value("${grid.url}")
    public URL gridUrl;

//    @BeforeAll
//    public static void setUpFirefoxForGrid() throws Exception {
//        //Resolve driver for selenium grid
//        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.chromedriver().setup();
//
//        //Start selenium grid in standalone mode
//        Main.main(new String[] {"standalone", "--port", "4444"});
//    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    @Scope("driverscope")
    public WebDriver getRemoteWebDriverForChrome() throws Exception {
//        return WebDriverManager.chromedriver().remoteAddress(gridUrl).create();
        return new RemoteWebDriver(gridUrl, DesiredCapabilities.chrome());
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    @Scope("driverscope")
    public WebDriver getRemoteWebDriverForFirefox() {
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.addArguments("--headless");
//        return WebDriverManager.firefoxdriver().remoteAddress(gridUrl).create();
//        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
//        firefoxOptions.merge(desiredCapabilities);
        return new RemoteWebDriver(gridUrl, DesiredCapabilities.firefox());
    }

}
