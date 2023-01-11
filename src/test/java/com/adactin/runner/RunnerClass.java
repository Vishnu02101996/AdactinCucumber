package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature", glue = "com.adactin.stepdefinition", monochrome = true, dryRun = false, strict = true, tags = ("@smokeTest, ~"
		+ "@regressionTest, @sanityTest"), plugin = { "html:Report/Cucumber_Report", "json:Report/Cucumber.json",
				"pretty", "com.cucumber.listener.ExtentCucumberFormatter:Report/File.html" })

public class RunnerClass extends BaseClass {

	@BeforeClass
	public static void set_Up() {
		browserLaunch("chrome");

	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
