package com.webapp.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LauchLogin {

	public WebDriver driver;

	public void initializeBrowser(String browser) {

		switch (Constants.BROWSER_NAME) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);

			driver = new ChromeDriver();

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

	public WebDriver launchUrl(String url) {

		driver.get(url);

		return driver;

	}
}
