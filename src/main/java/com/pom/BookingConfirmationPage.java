package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logoutBtn;

	public BookingConfirmationPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

}
