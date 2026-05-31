package com.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.BrowserSetup.BrowserSetup;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SurgeryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PractoSteps {

    WebDriver driver = BrowserSetup.getDriver();  // ✅ Use shared WebDriver instance
    HomePage homepage = new HomePage(driver);
    LoginPage loginpage = new LoginPage(driver);
    SurgeryPage surgerypage = new SurgeryPage(driver);

    @Given("user navigates to Practo Home page")
    public void user_navigates_to_practo_home_page() throws IOException {
        System.out.println("Practo Home Page Opened");
        
        String screenshotPath = BrowserSetup.takeScreenshot("Navigated_to_Practo_HomePage");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
    }

    @When("user clicks on login button and navigates to Signin Page")
    public void user_clicks_on_login_button_and_navigates_to_signin_page() throws InterruptedException, IOException {
        homepage.loginFunctionality();
        String screenshotPath = BrowserSetup.takeScreenshot("Clicked_on_Login_Button");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        System.out.println("Signin/Signup function");
    }

    @When("user clicks on login function")
    public void user_clicks_on_login_function() throws InterruptedException, IOException {
        loginpage.loginbtn();
        String screenshotPath = BrowserSetup.takeScreenshot("Clicked_on_Login_Function");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        System.out.println("Login Functionality");
    }

    @When("user enters the valid mobile number and password")
    public void user_enters_the_valid_mobile_number_and_password() throws InterruptedException, IOException {
        loginpage.loginCredentials();
        String screenshotPath = BrowserSetup.takeScreenshot("Entered_Valid_Credentials");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        System.out.println("Valid Mobile number and Password");
    }

    @Then("clicks on login button")
    public void clicks_on_login_button() throws IOException {
        loginpage.loginfinal();
        String screenshotPath = BrowserSetup.takeScreenshot("Clicked_on_Final_Login_Button");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        System.out.println("Login Button Clicked");
    }

    @Then("navigates to home page of practo")
    public void navigates_to_home_page_of_practo() throws InterruptedException, IOException {
        homepage.homepageValid();
        String screenshotPath = BrowserSetup.takeScreenshot("Navigated_to_HomePage");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        System.out.println("Home Page Loaded");
    }

    @Given("user navigates to Practo Home Page and login to Practo")
    public void user_navigates_to_practo_home_page_and_login_to_practo() throws InterruptedException, IOException {
        homepage.loginFunctionality();
        String screenshotPath = BrowserSetup.takeScreenshot("Login_Button_Clicked");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);

        loginpage.loginbtn();
        String screenshotPath2 = BrowserSetup.takeScreenshot("Signin_Button_Clicked");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath2);

        loginpage.loginCredentials();
        String screenshotPath3 = BrowserSetup.takeScreenshot("Entered_Login_Credentials");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath3);

        loginpage.loginfinal();
        String screenshotPath4 = BrowserSetup.takeScreenshot("Clicked_Final_Login_Button");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath4);

        System.out.println("User Logged into Practo");
    }

    @When("user clicks on surgery button from navigation bar")
    public void user_clicks_on_surgery_button_from_navigation_bar() throws InterruptedException, IOException {
        surgerypage.surgerybtnclick();
        String screenshotPath = BrowserSetup.takeScreenshot("Clicked_on_Surgery_Button");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        System.out.println("Surgery Page Navigation Clicked");
    }

    @When("user navigates to Surgery Page")
    public void user_navigates_to_surgery_page() throws InterruptedException, IOException {
        surgerypage.surgerypagelocatevalid();
        String screenshotPath = BrowserSetup.takeScreenshot("Navigated_to_Surgery_Page");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        System.out.println("Surgery Page Navigated");
    }

    @When("user validates the given mobile number on the surgery Page")
    public void user_validates_the_given_mobile_number_on_the_surgery_page() throws InterruptedException, IOException {
        surgerypage.mobileNumberValidate();
        String screenshotPath = BrowserSetup.takeScreenshot("Mobile_Number_Validated");
        ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        System.out.println("Mobile Number Validated");
    }

    // ✅ Attach Screenshot Method
    private void attachScreenshot(String stepName) throws IOException {
        String screenshotPath = BrowserSetup.takeScreenshot(stepName);
        if (screenshotPath != null) {
            ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        }
    }
}
