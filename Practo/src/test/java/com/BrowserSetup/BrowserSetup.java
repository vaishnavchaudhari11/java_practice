package com.BrowserSetup;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BrowserSetup {
    private static WebDriver driver;  // ✅ Shared WebDriver instance

    @Before
    public void setUp() {
        if (driver == null) { // ✅ Prevent multiple browser instances
            WebDriverManager.edgedriver().setup();
            
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-extensions");
            options.addArguments("--remote-allow-origins=*");

            driver = new EdgeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.practo.com/");

            System.out.println("Browser opened and navigated to: " + driver.getCurrentUrl());
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        // ✅ Capture Screenshot if Scenario Fails
        if (scenario.isFailed()) {
            String screenshotPath = takeScreenshot(scenario.getName());
            System.out.println("Screenshot taken for FAILED scenario: " + screenshotPath);
        }
        
        if (driver != null) {
            driver.quit();
            driver = null; // ✅ Reset driver to avoid stale sessions
            System.out.println("Browser session ended.");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    // ✅ Standalone Screenshot Method
    public static String takeScreenshot(String scenarioName) {
        if (driver == null) {
            System.out.println("Driver is null, cannot take screenshot.");
            return null;
        }

        // ✅ Take Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        
        // ✅ Define Screenshot Path
        String screenshotName = "screenshot_" + scenarioName.replace(" ", "_") + ".png";
        String screenshotPath = "target/screenshots/" + screenshotName;
        File destFile = new File(screenshotPath);

        try {
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved: " + screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return screenshotPath; // ✅ Return Screenshot Path for Extent Reports
    }
}
