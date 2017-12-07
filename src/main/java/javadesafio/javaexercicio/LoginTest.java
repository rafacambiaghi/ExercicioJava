package javadesafio.javaexercicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.junit.Test;

import pageobject.LoginPage;

public class LoginTest extends LoginPage {

	protected WebDriver driver;

	public void Login(WebDriver driver) {
		this.driver = driver;
	}

	public void inicializadriver() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void inicializasite() {
		driver.get(UrlBase);

	}

	public void acoeslogin(String identificacao, String senha) {

		driver.findElement(By.xpath(campoidentificacao)).sendKeys(identificacao);
		driver.findElement(By.xpath(camposenha)).sendKeys(senha);
		driver.findElement(By.xpath(btncontinuar)).click();
	}

	@Test
	public void realizaloga() {

		String identificacao = "42304200800";
		String senha = "42304200800";
		inicializadriver();
		inicializasite();
		acoeslogin(identificacao, senha);
	}

}
