package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;

	public static WebElement PIM(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));

		return element;

	}

	public static WebElement AddEmployee(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));

		return element;

	}

	public static WebElement firstname(WebDriver driver) {

		element = driver.findElement(By.name("firstName"));

		return element;

	}
	
	public static WebElement lastName(WebDriver driver) {

		element = driver.findElement(By.name("lastName"));

		return element;

	}
	
	
	public static WebElement btnSave(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='btnSave']"));

		return element;

	}
	
	
}
