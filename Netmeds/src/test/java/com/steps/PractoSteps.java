package com.steps;

import org.openqa.selenium.WebDriver;
import com.pages.BrowserSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PractoSteps {
	
	BrowserSetup browser;
	WebDriver webdriver;
	
	
	
	@Given("user navigates to Practo Home page")
	public void user_navigates_to_practo_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		browser = new BrowserSetup(webdriver);
		browser.setUp();
		System.out.println("Practo Home Page");
	}

	@When("user clicks on login button and navigates to Signin Page")
	public void user_clicks_on_login_button_and_navigates_to_signin_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Signin/Signup function");
	}

	@When("user clicks on login function")
	public void user_clicks_on_login_function() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Login Functionality");
	}

	@When("user enters the valid mobile number and password")
	public void user_enters_the_valid_mobile_number_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Valid Mobile number and Password");
	}

	@Then("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Login Button");
	}

	@Then("navigates to home page of practo")
	public void navigates_to_home_page_of_practo() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Home Page");
	}
}
