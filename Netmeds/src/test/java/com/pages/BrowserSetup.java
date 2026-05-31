package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup extends BasePage {

    public BrowserSetup(WebDriver driver) {
        super(driver);
    }

    WebDriver webdriver;
    WebDriverWait wait;

    public void setUp() {
        // Setup WebDriver for Edge
        WebDriverManager.edgedriver().setup();
        
        // Use EdgeOptions to ensure a clean start
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized"); // Start browser maximized
        options.addArguments("--disable-infobars"); // Disable infobars
        options.addArguments("--disable-gpu"); // Disable GPU for stability
        options.addArguments("--disable-extensions"); // Disable extensions
        options.addArguments("--remote-allow-origins=*"); // Fix potential WebDriver issues
        
        // Initialize WebDriver with options
        webdriver = new EdgeDriver(options);
        
        // Implicit wait to allow elements to load
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Load URL
        webdriver.get("https://www.practo.com/");
        
        // Verify URL is loaded
        System.out.println("Browser opened and navigated to: " + webdriver.getCurrentUrl());
    }

    public void tearDown() {
        if (webdriver != null) {
            webdriver.quit();
            System.out.println("Browser session ended.");
        }
    }
}
