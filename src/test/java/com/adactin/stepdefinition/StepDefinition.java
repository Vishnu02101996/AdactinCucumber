package com.adactin.stepdefinition;

import java.io.File; 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver = RunnerClass.driver;

	@Given("^User launch the Application$")
	public void user_launch_the_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");

	}

	@When("^User enter data in Username field$")
	public void user_enter_data_in_Username_field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vishnu1639");

	}

	@When("^User enter data in Password field$")
	public void user_enter_data_in_Password_field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("2J264A");

	}

	@Then("^User Click the Login button and it navigates to Search Hotel Page$")
	public void user_Click_the_Login_button_and_it_navigates_to_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

	@When("^User Select the location$")
	public void user_Select_the_location() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s1 = new Select(location);
		s1.selectByValue("London");
	}

	@When("^User select the Number of Rooms$")
	public void user_select_the_Number_of_Rooms() throws Throwable {
		WebElement rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s2 = new Select(rooms);
		s2.selectByValue("2");
	}

	@When("^User select the check in date$")
	public void user_select_the_check_in_date() throws Throwable {
		WebElement checkinDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkinDate.clear();
		checkinDate.sendKeys("20/11/2022");
	}

	@When("^User select the check out date$")
	public void user_select_the_check_out_date() throws Throwable {
		WebElement checkoutDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkoutDate.clear();
		checkoutDate.sendKeys("22/11/2022");
	}

	@When("^User select the Adults count per room$")
	public void user_select_the_Adults_count_per_room() throws Throwable {
		WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s3 = new Select(adults);
		s3.selectByValue("2");
	}

	@Then("^User Click the search button and it navigates to the Select Hotel page$")
	public void user_Click_the_search_button_and_it_navigates_to_the_Select_Hotel_page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@When("^User select preferred hotel from the shown list$")
	public void user_select_preferred_hotel_from_the_shown_list() throws Throwable {
		driver.findElement(By.xpath("//input[@name='radiobutton_2']")).click();
	}

	@Then("^User click on Continue button and it navigates to Book a hotel page$")
	public void user_click_on_Continue_button_and_it_navigates_to_Book_a_hotel_page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='continue']")).click();
	}

	@When("^User enters First name$")
	public void user_enters_First_name() throws Throwable {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Vishnu");
	}

	@When("^User enters Last name$")
	public void user_enters_Last_name() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("V");
	}

	@When("^User enters billing address$")
	public void user_enters_billing_address() throws Throwable {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Avadi,Chennai-600054");
	}

	@When("^User enters credit card number$")
	public void user_enters_credit_card_number() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567887654321");
	}

	@When("^User select credit card type$")
	public void user_select_credit_card_type() throws Throwable {
		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s4 = new Select(cardType);
		s4.selectByValue("VISA");
	}

	@When("^User select card expiry date$")
	public void user_select_card_expiry_date() throws Throwable {
		WebElement expMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s5 = new Select(expMonth);
		s5.selectByValue("4");
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s6 = new Select(expYear);
		s6.selectByValue("2022");
	}

	@When("^User enters CVV number$")
	public void user_enters_CVV_number() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("987");
	}

	@Then("^User click Book now button and it navigates to Booking confirmation page$")
	public void user_click_Book_now_button_and_it_navigates_to_Booking_confirmation_page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		Thread.sleep(5000);
	}

	@Then("^User takes page screenshot for future reference$")
	public void user_takes_page_screenshot_for_future_reference() throws Throwable {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,100)");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:/Snap/Confirmation.png");
		FileUtils.copyFile(source, des);

	}

	@Then("^User click on Logout button and it navigates to Home page$")
	public void user_click_on_Logout_button_and_it_navigates_to_Home_page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='logout']")).click();
		Thread.sleep(3000);

	}

}
