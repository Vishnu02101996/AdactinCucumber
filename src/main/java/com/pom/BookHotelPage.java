package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;

	public BookHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBooknowBtn() {
		return booknowBtn;
	}

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardNo;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardType;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expiryMonth;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiryYear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNo;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknowBtn;

}
