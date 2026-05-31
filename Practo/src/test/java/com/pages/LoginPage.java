package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	//WebDriver webdriver;
	//WebDriverWait wait;
	
	public void loginbtn() throws InterruptedException {
		
		WebElement login = driver.findElement(By.xpath("//a[@id='loginLink']"));
		//wait.until(ExpectedConditions.visibilityOf(login));
		Thread.sleep(1000);
		login.click();
		
	}
	
	
	public void loginCredentials() throws InterruptedException {
		
		WebElement MobileNo = driver.findElement(By.xpath("//input[@id='username']"));
		//wait.until(ExpectedConditions.visibilityOf(MobileNo));
		Thread.sleep(1000);
		MobileNo.sendKeys("9145537111");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		//wait.until(ExpectedConditions.visibilityOf(Password));
		Thread.sleep(1000);
		Password.sendKeys("India@9145537111");
		
	}
	
	
	public void loginfinal() {
		
		WebElement login = driver.findElement(By.xpath("//button[@id='login']"));
		//wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
	}

}
