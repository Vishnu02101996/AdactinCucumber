Feature: Hotel booking using Adactin Application 

@smokeTest 
Scenario: Login Page functionality 
	Given User launch the Application 
	When User enter data in Username field 
	And User enter data in Password field 
	Then User Click the Login button and it navigates to Search Hotel Page 
	
@sanityTest 
Scenario: User enter details to Search Hotel 
	When User Select the location 
	And User select the Number of Rooms 
	And User select the check in date 
	And User select the check out date 
	And User select the Adults count per room 
	Then User Click the search button and it navigates to the Select Hotel page 
	
@sanityTest 
Scenario: User Select a Hotel from Select Hotel page 
	When User select preferred hotel from the shown list 
	Then User click on Continue button and it navigates to Book a hotel page 
	
@sanityTest 
Scenario: User Books a hotel in Book hotel page 
	When User enters First name 
	And User enters Last name 
	And User enters billing address 
	And User enters credit card number 
	And User select credit card type 
	And User select card expiry date 
	And User enters CVV number 
	Then User click Book now button and it navigates to Booking confirmation page 
	
@sanityTest 
Scenario: User takes Screenshot of hotel booking confirmation 
	Then User takes page screenshot for future reference 
	
@regressionTest 
Scenario: Logout page Functionality 
	Then User click on Logout button and it navigates to Home page 
	
