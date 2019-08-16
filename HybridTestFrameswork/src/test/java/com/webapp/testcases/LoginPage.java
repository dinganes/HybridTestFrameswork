package com.webapp.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.webapp.utilities.LauchLogin;

//POM

//Configuration

public class LoginPage extends LauchLogin {

	LauchLogin obj = new LauchLogin(driver);

	@Test
	public void loginApp() {

		WebElement username = obj.getWebElement("//*[@type='text']", "User name");

		username.sendKeys("mngr215874");

		WebElement password = obj.getWebElement("//*[@type='password']", "password");

		password.sendKeys("qApYdAh");

		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));

		login.click();

		obj.closeApp();

	}

}
