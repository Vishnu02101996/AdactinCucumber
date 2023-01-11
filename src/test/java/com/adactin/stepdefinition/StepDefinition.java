package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.runner.RunnerClass;
import com.baseclass.BaseClass;
import com.pom.BookHotelPage;
import com.pom.BookingConfirmationPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelectHotelPage;
import com.sdp.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = RunnerClass.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User launch the Application$")
	public void user_launch_the_Application() throws Throwable {
		getURL("https://adactinhotelapp.com/");
	}

	@When("^User enter data in Username field$")
	public void user_enter_data_in_Username_field() throws Throwable {
		inputValues(pom.getInstanceLp().getUserName(), "vishnu1639");
	}

	@When("^User enter data in Password field$")
	public void user_enter_data_in_Password_field() throws Throwable {
		inputValues(pom.getInstanceLp().getPassWord(), "2J264A");
	}

	@Then("^User Click the Login button and it navigates to Search Hotel Page$")
	public void user_Click_the_Login_button_and_it_navigates_to_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceLp().getLoginBtn());
	}

	@When("^User Select the location$")
	public void user_Select_the_location() throws Throwable {
		dropDown(pom.getInstanceSp1().getLocation(), "value", "London");
	}

	@When("^User select the Number of Rooms$")
	public void user_select_the_Number_of_Rooms() throws Throwable {
		dropDown(pom.getInstanceSp1().getRooms(), "value", "2");
	}

	@When("^User select the check in date$")
	public void user_select_the_check_in_date() throws Throwable {
		clearValues(pom.getInstanceSp1().getCheckinDate());
		inputValues(pom.getInstanceSp1().getCheckinDate(), "20/11/2022");
	}

	@When("^User select the check out date$")
	public void user_select_the_check_out_date() throws Throwable {
		clearValues(pom.getInstanceSp1().getCheckoutDate());
		inputValues(pom.getInstanceSp1().getCheckoutDate(), "22/11/2022");
	}

	@When("^User select the Adults count per room$")
	public void user_select_the_Adults_count_per_room() throws Throwable {
		dropDown(pom.getInstanceSp1().getAdults(), "value", "2");
	}

	@Then("^User Click the search button and it navigates to the Select Hotel page$")
	public void user_Click_the_search_button_and_it_navigates_to_the_Select_Hotel_page() throws Throwable {
		clickOnElement(pom.getInstanceSp1().getSearchBtn());
	}

	@When("^User select preferred hotel from the shown list$")
	public void user_select_preferred_hotel_from_the_shown_list() throws Throwable {
		clickOnElement(pom.getInstanceSp2().getSelectHotel());
	}

	@Then("^User click on Continue button and it navigates to Book a hotel page$")
	public void user_click_on_Continue_button_and_it_navigates_to_Book_a_hotel_page() throws Throwable {
		clickOnElement(pom.getInstanceSp2().getContinueBtn());
	}

	@When("^User enters First name$")
	public void user_enters_First_name() throws Throwable {
		inputValues(pom.getInstanceBp().getFirstName(), "Vishnu");
	}

	@When("^User enters Last name$")
	public void user_enters_Last_name() throws Throwable {
		inputValues(pom.getInstanceBp().getLastName(), "V");
	}

	@When("^User enters billing address$")
	public void user_enters_billing_address() throws Throwable {
		inputValues(pom.getInstanceBp().getAddress(), "Avadi,Chennai-600054");
	}

	@When("^User enters credit card number$")
	public void user_enters_credit_card_number() throws Throwable {
		inputValues(pom.getInstanceBp().getCardNo(), "1234567887654321");
	}

	@When("^User select credit card type$")
	public void user_select_credit_card_type() throws Throwable {
		dropDown(pom.getInstanceBp().getCardType(), "value", "VISA");
	}

	@When("^User select card expiry date$")
	public void user_select_card_expiry_date() throws Throwable {
		dropDown(pom.getInstanceBp().getExpiryMonth(), "value", "4");
		dropDown(pom.getInstanceBp().getExpiryYear(), "value", "2022");
	}

	@When("^User enters CVV number$")
	public void user_enters_CVV_number() throws Throwable {
		inputValues(pom.getInstanceBp().getCvvNo(), "987");
	}

	@Then("^User click Book now button and it navigates to Booking confirmation page$")
	public void user_click_Book_now_button_and_it_navigates_to_Booking_confirmation_page() throws Throwable {
		clickOnElement(pom.getInstanceBp().getBooknowBtn());
		sleep(5000);
	}

	@Then("^User takes page screenshot for future reference$")
	public void user_takes_page_screenshot_for_future_reference() throws Throwable {
		screenshot("C:/Snap/Confirmation.png");
	}

	@Then("^User click on Logout button and it navigates to Home page$")
	public void user_click_on_Logout_button_and_it_navigates_to_Home_page() throws Throwable {
		clickOnElement(pom.getInstanceBcp().getLogoutBtn());
	}
}
