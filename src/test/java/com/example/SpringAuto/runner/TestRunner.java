package com.example.SpringAuto.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features={"src/test/java/com/example/SpringAuto/features"},
        glue={"com.example.SpringAuto.steps"},
        plugin = {
                "pretty",
                "html:target/cucumber/Report.html",
                "json:target/cucumber/Report.json",
                "junit:target/cucumber/Report.xml"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {

        //Make the parallel as false for sequential execution
        @DataProvider(parallel = true)
        @Override
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
