package com.webapp.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FunctionalLibrary {

	public WebDriver driver;

	@BeforeClass
	public WebDriver launchUrl() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/V4/index.php");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		return driver;

	}

	@AfterClass
	public void closeApp() {

		driver.quit();

	}

}
