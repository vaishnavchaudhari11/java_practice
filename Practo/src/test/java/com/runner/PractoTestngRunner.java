package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/feature/PractoFeature.feature",      
        glue = {"com.steps", "com.BrowserSetup"},                         
        plugin = {
            "pretty",                                 
            "html:target/cucumber-reports/Cucumber.html",  
            "json:target/cucumber-reports/Cucumber.json",  
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // ✅ Extent Reports for screenshots
        },
        monochrome = true,
        tags = "@login"
)
public class PractoTestngRunner extends AbstractTestNGCucumberTests {
}
