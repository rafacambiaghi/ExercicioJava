package javadesafioorange;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Import package pageObject.*

import pageObjects.LogIn_Page;
import pageObjects.HomePage;
import pageObjects.SalaryPage;

public class desafioumautomacao {
	private static WebDriver driver = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Nova pasta2\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");

		// Use page Object library now

		LogIn_Page.txtUsername(driver).sendKeys("Admin");

		LogIn_Page.txtPassword(driver).sendKeys("admin");

		LogIn_Page.btnLogin(driver).click();

		HomePage.PIM(driver).click();

		HomePage.AddEmployee(driver).click();

		HomePage.firstname(driver).sendKeys("Rafael");

		HomePage.lastName(driver).sendKeys("Puga");

		HomePage.btnSave(driver).click();

		SalaryPage.SalaryOption(driver).click();

		SalaryPage.AddSalary(driver).click();

		SalaryPage.Salarysalgrdcode(driver).click();

		SalaryPage.SalaryComponent(driver).sendKeys("1000");

		SalaryPage.Salarypayperodcode(driver).click();

		SalaryPage.Salarycurrencyid(driver).click();

		SalaryPage.Salarybasicsalary(driver).sendKeys("125000");

		SalaryPage.btnSalarysave(driver).click();

		driver.findElement(By.xpath("//*[@id='salaryMiniList']/div[1]/h1"));
		System.out.print("Se selecionou irá apresentar essa mensagem");

	}
}

// System.setProperty("webdriver.chrome.driver",
// "C:\\Novapasta2\\chromedriver.exe");
// driver = new ChromeDriver();
// driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
// driver.findElement(By.name("txtUsername")).sendKeys("Admin");
// driver.findElement(By.name("txtPassword")).sendKeys("admin");
// driver.findElement(By.name("Submit")).click();
// driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
// driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']")).click();
// driver.findElement(By.name("firstName")).sendKeys("Rafael");
// driver.findElement(By.name("lastName")).sendKeys("Puga");
// driver.findElement(By.xpath("//*[@id='btnSave']")).click();
// driver.findElement(By.xpath("//*[@id='sidenav']/li[7]/a")).click();
// driver.findElement(By.xpath("//*[@id='addSalary']")).click();

// driver.findElement(By.cssSelector("#salary_sal_grd_code")).click();
// Select select = new Select(driver.findElement(By.id("salary_sal_grd_code")));
// select.selectByVisibleText("Chief Executive Officer (C.E.O)");

// driver.findElement(By.name("salary[salary_component]")).sendKeys("1000");

// driver.findElement(By.cssSelector("#salary_payperiod_code")).click();
// select = new Select(driver.findElement(By.id("salary_payperiod_code")));
// select.selectByVisibleText("Hourly");

// driver.findElement(By.cssSelector("#salary_currency_id")).click();
// select = new Select(driver.findElement(By.id("salary_currency_id")));
// select.selectByVisibleText("United States Dollar");
// driver.findElement(By.xpath("//*[@id='salary_basic_salary']")).sendKeys("125000");
// driver.findElement(By.xpath("//*[@id='btnSalarySave']")).click();

// driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Rafael");
// driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("Everson");
// driver.findElement(By.xpath("//*[@id='empsearch_id']")).sendKeys("010");

// driver.findElement(By.cssSelector("#empsearch_job_title")).click();
// Select select = new
// Select(driver.findElement(By.id("empsearch_job_title")));
// select.selectByVisibleText("CEO");

// driver.findElement(By.cssSelector("#empsearch_employee_status")).click();
// select = new
// Select(driver.findElement(By.id("empsearch_employee_status")));
// select.selectByVisibleText("Full-Time Permanent");

// driver.findElement(By.cssSelector("#empsearch_sub_unit")).click();
// select = new Select(driver.findElement(By.id("empsearch_sub_unit")));
// select.selectByVisibleText("IT");

// driver.findElement(By.cssSelector("#empsearch_termination")).click();
// select = new
// Select(driver.findElement(By.id("empsearch_termination")));
// select.selectByVisibleText("Current and Past Employees");
