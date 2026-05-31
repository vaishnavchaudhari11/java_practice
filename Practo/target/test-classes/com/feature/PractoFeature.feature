Feature: Practo Automation


@login
Scenario: Login with valid credentials
Given user navigates to Practo Home page
When user clicks on login button and navigates to Signin Page
And user clicks on login function
And user enters the valid mobile number and password
Then clicks on login button 
And navigates to home page of practo


@SurgeryPage-MobileNo
Scenario: Mobile Number Validation on Surgery Page
Given user navigates to Practo Home Page and login to Practo
When user clicks on surgery button from navigation bar
When user navigates to Surgery Page
And user validates the given mobile number on the surgery Page


@SurgeryPage-consultationBooking
Scenario: Consultation Booking on Surgery Page
Given user navigates to the Practo home page
And user clicks on signin/signup button
Then user navigates to login functionality and clicks on login button
And user enters the login credentials by entering the login details 
Then user clicks on surgery page and navigates to surgery page
And user selects the city and disease for the enquiry
Then user enters the "name" and "phoneno" in the details
And user clicks on book appointment button and validates the booking






