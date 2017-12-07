package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

	private static WebElement element = null;

	public static WebElement txtUsername(WebDriver driver) {

		element = driver.findElement(By.id("txtUsername"));

		return element;

	}

	public static WebElement txtPassword(WebDriver driver) {

		element = driver.findElement(By.id("txtPassword"));

		return element;

	}

	public static WebElement btnLogin(WebDriver driver) {

		element = driver.findElement(By.name("Submit"));

		return element;

	}
}