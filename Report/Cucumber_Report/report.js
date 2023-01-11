$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking using Adactin Application",
  "description": "",
  "id": "hotel-booking-using-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login Page functionality",
  "description": "",
  "id": "hotel-booking-using-adactin-application;login-page-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter data in Username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter data in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click the Login button and it navigates to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_Application()"
});
formatter.result({
  "duration": 3899502200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_data_in_Username_field()"
});
formatter.result({
  "duration": 77990499,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_data_in_Password_field()"
});
formatter.result({
  "duration": 51704999,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_the_Login_button_and_it_navigates_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1066239400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User enter details to Search Hotel",
  "description": "",
  "id": "hotel-booking-using-adactin-application;user-enter-details-to-search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User Select the location",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User select the Number of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User select the check in date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User select the check out date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User select the Adults count per room",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Click the search button and it navigates to the Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_the_location()"
});
formatter.result({
  "duration": 155949500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_Number_of_Rooms()"
});
formatter.result({
  "duration": 147321800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_check_in_date()"
});
formatter.result({
  "duration": 97438200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_check_out_date()"
});
formatter.result({
  "duration": 116725901,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_Adults_count_per_room()"
});
formatter.result({
  "duration": 134182300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_the_search_button_and_it_navigates_to_the_Select_Hotel_page()"
});
formatter.result({
  "duration": 1131330799,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User Select a Hotel from Select Hotel page",
  "description": "",
  "id": "hotel-booking-using-adactin-application;user-select-a-hotel-from-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User select preferred hotel from the shown list",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User click on Continue button and it navigates to Book a hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_preferred_hotel_from_the_shown_list()"
});
formatter.result({
  "duration": 59110101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_Continue_button_and_it_navigates_to_Book_a_hotel_page()"
});
formatter.result({
  "duration": 1522847399,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User Books a hotel in Book hotel page",
  "description": "",
  "id": "hotel-booking-using-adactin-application;user-books-a-hotel-in-book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "User enters First name",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User enters Last name",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User enters billing address",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enters credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User select credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User select card expiry date",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters CVV number",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User click Book now button and it navigates to Booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_First_name()"
});
formatter.result({
  "duration": 74149800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_Last_name()"
});
formatter.result({
  "duration": 101752799,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_billing_address()"
});
formatter.result({
  "duration": 92779099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_credit_card_number()"
});
formatter.result({
  "duration": 83997700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_credit_card_type()"
});
formatter.result({
  "duration": 155378500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_card_expiry_date()"
});
formatter.result({
  "duration": 302401400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_CVV_number()"
});
formatter.result({
  "duration": 58054200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_Book_now_button_and_it_navigates_to_Booking_confirmation_page()"
});
formatter.result({
  "duration": 5062700600,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User takes Screenshot of hotel booking confirmation",
  "description": "",
  "id": "hotel-booking-using-adactin-application;user-takes-screenshot-of-hotel-booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User takes page screenshot for future reference",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_takes_page_screenshot_for_future_reference()"
});
formatter.result({
  "duration": 635589601,
  "status": "passed"
});
});