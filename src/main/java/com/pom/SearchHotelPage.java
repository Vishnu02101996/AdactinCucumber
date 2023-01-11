package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	public WebDriver driver;
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement rooms;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkinDate;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkoutDate;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adults;

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement searchBtn;

	public SearchHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

}
