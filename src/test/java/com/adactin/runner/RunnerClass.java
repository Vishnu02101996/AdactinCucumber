package com.adactin.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
                 glue = "com.adactin.stepdefinition", monochrome = true, dryRun = false, strict = true,
                 tags= ("@smokeTest, ~"
                 		+ "@regressionTest, @sanityTest"),
                 plugin= {"html:Report/Cucumber_Report", 
                		 "json:Report/Cucumber.json",
                		 "pretty",
                		 "com.cucumber.listener.ExtentCucumberFormatter:Report/File.html"}
                 )

public class RunnerClass {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
