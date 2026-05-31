package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void loginFunctionality() throws InterruptedException {
    	
        Thread.sleep(3000); // ✅ Adding delay before interacting
        WebElement loginbtn = driver.findElement(By.xpath("//div[@class='nav-items']//span//a[@name='Practo login']"));
        //wait.until(ExpectedConditions.visibilityOf(loginbtn));
        loginbtn.click();
        System.out.println("✅ Login button clicked successfully!");
    }

    public void homepageValid() throws InterruptedException {
        Thread.sleep(3000); // ✅ Adding delay before validation
        WebElement textValid = driver.findElement(By.xpath("//span[@class='up-triangle']//span[@class='user_info_top']"));
        //wait.until(ExpectedConditions.visibilityOf(textValid));
        String actualText = textValid.getText();

        String expectedText = "Vaish";
        System.out.println("🔎 Actual Text: " + actualText + " | Expected Text: " + expectedText);

        Assert.assertEquals(actualText, expectedText, "❌ Home page validation failed!");
        System.out.println("✅ Home page validation passed!");
    }
}
