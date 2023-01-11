package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='radiobutton_2']")
	private WebElement selectHotel;

	public SelectHotelPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continueBtn;

}
