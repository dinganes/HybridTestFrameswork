package com.webapp.utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class LauchLogin {

	public WebDriver driver;

	public LauchLogin(WebDriver driver) {

		this.driver = driver;
	}

	@BeforeTest
	public void initializeBrowser() {

		switch (Constants.BROWSER_NAME) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);

			Reporter.log("======Chrome path has been set=======", true);

			driver = new ChromeDriver();

			Reporter.log("======Chrome driver launched successfully=======", true);

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			break;

		case "ie":

			System.setProperty("webdriver.chrome.driver", Constants.IE_DRIVER_PATH);

			driver = new InternetExplorerDriver();

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			break;

		case "gecko":

			System.setProperty("webdriver.chrome.driver", Constants.FIREFOX_DRIVER_PATH);

			driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			break;

		default:

			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			break;

		}

	}

	@BeforeClass
	public WebDriver launchUrl() {

		driver.get(Constants.URL);

		Reporter.log("======Specified URL  " + Constants.URL + " has been launched successfully=======", true);

		return driver;

	}

	public WebElement getWebElement(String eleAddress, String label) {

		WebElement username = null;

		try {

			username = driver.findElement(By.xpath(eleAddress));

			Reporter.log("===========Element found suceessfully =======", true);

		}

		catch (NoSuchElementException e) {

			Reporter.log("=======Element is not found - check your xpath/DOM==========", true);
		}
		return username;

	}

	public void closeApp() {

		if (driver != null) {

			driver.quit();

			Reporter.log("======Browser closed successfully=======", true);

		}

	}
}
