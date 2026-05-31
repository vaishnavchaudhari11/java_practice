package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BrowserSetup extends BasePage {

    public BrowserSetup(WebDriver driver) {
        super(driver);
    }

    public void setUp() {
        // Setup WebDriver for Edge
        WebDriverManager.edgedriver().setup();
        
        // Use EdgeOptions for clean startup
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("--remote-allow-origins=*");

        // ✅ Properly assign WebDriver to the inherited driver from BasePage
        this.driver = new EdgeDriver(options);

        // ✅ Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ✅ Load URL
        driver.get("https://www.practo.com/");
        System.out.println("Browser opened and navigated to: " + driver.getCurrentUrl());
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser session ended.");
        }
    }
}
