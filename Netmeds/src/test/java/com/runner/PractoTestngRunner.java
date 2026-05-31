package com.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/feature/PractoFeature.feature",      // Path to your feature files
        glue = "com.steps",                                               // Path to your step definition classes only (no Hooks)
        plugin = {
            "pretty",                                 // Optional: to print detailed logs in the console
            "html:target/cucumber-reports/Cucumber.html",  // Generates an HTML report
            "json:target/cucumber-reports/Cucumber.json"   // Generates a JSON report
        },
        tags = "@login",                            // Optional: specify tags to filter scenarios (if needed)
        monochrome = true                             // Optional: makes console output more readable
)
		


		public class PractoTestngRunner extends AbstractTestNGCucumberTests {
	


		}
