package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SurgeryPage extends BasePage{

	public SurgeryPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//div[@class='product-tab__title' and text() = 'Surgeries']")
	WebElement surgerybtn;
	
	@FindBy(xpath= "//h1[@class='text-module_base__1vdUh text-white-1 font-bold']")
	WebElement mobileno;
	
	@FindBy(xpath = "//h1[@class='text-module_base__1vdUh mt-24px mb-14px font-bold text-36px text-white-1 leading-normal']")
	WebElement surgerypage;
	
	
	public void surgerybtnclick() throws InterruptedException {
		
		Thread.sleep(2000);
		surgerybtn.click();
		Thread.sleep(2000);
	}
	
	
	public void surgerypagelocatevalid() throws InterruptedException {
		
		String Actual = surgerypage.getText();
		String Expected = "End to end care from Top Surgeons at our Practo Care Clinics";
		
		System.out.println(Actual);
		
		if(Actual.equalsIgnoreCase(Expected)) {
			
			Assert.assertEquals(Actual, Expected, "SurgeryPage Navigated");
			Thread.sleep(2000);
		}
	}
	
	
	public void mobileNumberValidate() throws InterruptedException {
		
		String Actual = mobileno.getText();
		String Expected = "08045685554";
		
		System.out.println(Actual);
		
		if(Actual.equalsIgnoreCase(Expected) && Actual.startsWith("080")) {
			
			Assert.assertEquals(Actual, Expected, "Mobile Number Validated");
			Thread.sleep(2000);
		}
		
	}

}
