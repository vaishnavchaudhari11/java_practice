package com.vc.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	
	
	@Test
	public void launch(String[] args) {
		WebDriver webdriver;
		
		 WebDriverManager.chromedriver().setup();

	        // Instantiate ChromeDriver (this will launch the Chrome browser)
	        WebDriver driver = new ChromeDriver();

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Navigate to Google's homepage
	        driver.get("https://www.google.com");
		
	}

}
