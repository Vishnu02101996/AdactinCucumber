package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static String value;

	// 1.Browser Launch()
	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	// 2.Close()
	public static void close() {
		driver.close();
	}

	// 3.Quit
	public static void quit() {
		driver.quit();
	}

	// 4.Navigate to()
	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}

	// 5.Navigate back()
	public static void previousPage() {
		driver.navigate().back();
	}

	// 6.Navigate forward()
	public static void nextPage() {
		driver.navigate().forward();
	}

	// 7.Navigate refresh()
	public static void RefreshPage() {
		driver.navigate().refresh();
	}

	// 8.Get()
	public static void getURL(String url) {
		driver.get(url);
	}

	// 9.Alert
	public static void alert(String type, String value) {
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("ok")) {
			a.accept();
		} else if (type.equalsIgnoreCase("cancel")) {
			a.dismiss();
		} else if (type.equalsIgnoreCase("gettext")) {
			a.getText();
		} else if (type.equalsIgnoreCase("input")) {
			a.sendKeys(value);
		}
	}

	// 10.Action
	public static void actions(WebElement element1, WebElement element2, String type) {
		if (type.equalsIgnoreCase("click")) {
			Actions a = new Actions(driver);
			a.click(element1).perform();
		} else if (type.equalsIgnoreCase("rightclick")) {
			Actions a = new Actions(driver);
			a.contextClick(element1).perform();
		} else if (type.equalsIgnoreCase("moveto")) {
			Actions a = new Actions(driver);
			a.moveToElement(element1).perform();
		} else if (type.equalsIgnoreCase("dragdrop")) {
			Actions a = new Actions(driver);
			a.dragAndDrop(element1, element2).perform();
		}
	}

	// 11.Frames
	public static void frame(String type, String values, WebElement element) {
		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			driver.switchTo().frame(index);
		} else if (type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(values);
		} else if (type.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(element);
		}
	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	// 12.Robot()
	public static void robotOptions() throws AWTException {
		Robot r = new Robot();
		//r.keyPress(KeyEvent.VK);
	}

	// 13.Window handles()

	// 14.Drop Down()
	public static void dropDown(WebElement element, String type, String values) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(values);
		} else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(values);
		}
	}

	// 15.Check Box()

	// 16.Is Enable()
	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	// 17.Is Displayed()
	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	// 18.Is Selected()
	public static boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	// 19.Get Options()
	public static void allOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement optList : options) {
			System.out.println(optList.getText());
		}
	}

	// 20.Get Title()
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 21.Get CurrentUrl()
	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	// 22.Get text()
	public static String getValues(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 23.Get attribute()
	public static String getAttributeValue(WebElement element, String attributename) {
		String attributeValue = element.getAttribute(attributename);
		return attributeValue;
	}

	// 24.Wait()
	public static void waitSec(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// 25.Take Screenshot()
	public static void screenshot(String path) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}

	// 26.Scroll up and Down()
	public static void scrollUp() {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_UP).build().perform();
	}

	public static void scrollDown() {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	// 27.Send keys()
	public static void inputValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	// 28.Get First selected options()
	public static void firstSelectedOption(WebElement element) {
		Select s = new Select(element);
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
	}

	// 29.Get all selected options()
	public static void allSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement optList : options) {
			System.out.println(optList.getText());
		}
	}

	// 30.Is multiple()
	public static boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;

	}

	// 31.Click()
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// 32.RadioButton()
	public static void RadioButton(WebElement element) {
		element.click();
	}

	// 33.Sleep()
	public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	// 34.Clear()
	public static void clearValues(WebElement element) {
		element.clear();
	}

	// 35.Get Tag name()
	public static String getTagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	// 36.Read Data()
	public static String read_Particular_Data(String path, int sheet_index, int row_index, int cell_index)
			throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(sheet_index);
		Row row = sheetAt.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType Type = cell.getCellType();
		if (Type.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else if (Type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int cellValue = (int) numericCellValue;
			value = Integer.toString(cellValue);
		}
		w.close();
		return value;
	}

	// 37.Get CSS Value
	public static void cssValue(WebElement element, String type) {
		if (type.equalsIgnoreCase("font-size")) {
			String fontSize = element.getCssValue(type);
			System.out.println(fontSize);
		} else if (type.equalsIgnoreCase("color")) {
			String colour = element.getCssValue(type);
			System.out.println(colour);
		} else {
			System.out.println("invalid type");
		}
	}

}
