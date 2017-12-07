package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class SalaryPage {

	private static WebElement element = null;

	public static WebElement SalaryOption(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='sidenav']/li[7]/a"));

		return element;

	}

	public static WebElement AddSalary(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='addSalary']"));

		return element;

	}

	public static WebElement Salarysalgrdcode(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#salary_sal_grd_code"));
		Select select = new Select(driver.findElement(By.id("salary_sal_grd_code")));
		select.selectByVisibleText("Chief Executive Officer (C.E.O)");

		return element;

	}

	public static WebElement SalaryComponent(WebDriver driver) {

		element = driver.findElement(By.name("salary[salary_component]"));

		return element;

	}

	public static WebElement Salarypayperodcode(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#salary_payperiod_code"));
		Select select = new Select(driver.findElement(By.id("salary_payperiod_code")));
		select.selectByVisibleText("Hourly");

		return element;

	}

	public static WebElement Salarycurrencyid(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#salary_currency_id"));
		Select select = new Select(driver.findElement(By.id("salary_currency_id")));
		select.selectByVisibleText("United States Dollar");

		return element;

	}

	public static WebElement Salarybasicsalary(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='salary_basic_salary']"));

		return element;

	}

	public static WebElement btnSalarysave(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='btnSalarySave']"));

		return element;

	}
	
}
