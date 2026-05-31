package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    //protected WebDriverWait wait;

    // Constructor initializes the WebDriver and PageFactory
    public BasePage(WebDriver driver) {
        this.driver = driver;
        //this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);  // Initializes the PageFactory elements
    }

    /*
    // Find a single element
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    // Find multiple elements
    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    // Click on an element
    public void clickElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Send text to an input field
    public void sendKeys(By locator, String text) {
        WebElement element = findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    // Get text from an element
    public String getText(By locator) {
        return findElement(locator).getText();
    }

    // Wait for an element to be visible
    public void waitForElementToBeVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for an element to be clickable
    public void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Navigate to a given URL
    public void navigateTo(String url) {
        driver.get(url);
    }

    // Refresh the page
    public void refreshPage() {
        driver.navigate().refresh();
    }

    // Go back to the previous page
    public void goBack() {
        driver.navigate().back();
    }

    // Check if an element is displayed
    public boolean isElementDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    // Check if an element is enabled
    public boolean isElementEnabled(By locator) {
        return findElement(locator).isEnabled();
    }
    */
}

