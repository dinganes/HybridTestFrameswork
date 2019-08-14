package com.webapp.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.webapp.utilities.LauchLogin;

public class LoginPage extends LauchLogin {

	@Test
	public void loginApp() {

		LoginPage browser = new LoginPage();

		browser.initializeBrowser("chrome");

		browser.launchUrl("http://demo.guru99.com/V4/index.php");

		WebElement username = driver.findElement(By.xpath("//*[@type='text']"));

		username.sendKeys("mngr215874");

		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));

		password.sendKeys("qApYdAh");

		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));

		login.click();

	}

}
