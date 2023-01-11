package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.BookHotelPage;
import com.pom.BookingConfirmationPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelectHotelPage;

public class PageObjectManager {

	public WebDriver driver;
	private LoginPage lp;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public LoginPage getInstanceLp() {
		lp = new LoginPage(driver);
		return lp;
	}

	private SearchHotelPage sp1;

	public SearchHotelPage getInstanceSp1() {
		sp1 = new SearchHotelPage(driver);
		return sp1;
	}

	public SelectHotelPage getInstanceSp2() {
		sp2 = new SelectHotelPage(driver);
		return sp2;
	}

	public BookHotelPage getInstanceBp() {
		bp = new BookHotelPage(driver);
		return bp;
	}

	public BookingConfirmationPage getInstanceBcp() {
		bcp = new BookingConfirmationPage(driver);
		return bcp;
	}

	private SelectHotelPage sp2;
	private BookHotelPage bp;
	private BookingConfirmationPage bcp;

}
