package javadesafio.javaexercicio;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.Document;
import static org.junit.Assert.assertTrue;
import java.awt.Desktop;
import java.io.*;
import pageobject.FrequenciaPage;

public class FrequenciaTest extends FrequenciaPage {

	protected WebDriver driver;

	public void Login(WebDriver driver) {
		this.driver = driver;
	}

	public void inicializadriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Nova pasta2\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void inicializasite() {
		driver.get(getUrlBase());

	}

	public void acoeslogin(String identificacao, String senha) {

		driver.findElement(By.xpath(campoidentificacao)).sendKeys(identificacao);
		driver.findElement(By.xpath(camposenha)).sendKeys(senha);
		driver.findElement(By.xpath(btncontinuar)).click();
		driver.findElement(By.xpath(gerarespelho)).click();
		driver.findElement(By.xpath(campofuncionario)).click();
		driver.findElement(By.xpath(campomatricula)).click();

	}

	public void validaracoeslogin() {

		boolean achouNome = driver.getPageSource().contains("31798952840 - RAFAEL PUGA CAMBIAGHI");
		assertTrue(achouNome);
		System.out.println("Nome foi achado com sucesso !");
		boolean achouMatricula = driver.getPageSource().contains("0598");
		assertTrue(achouMatricula);
		System.out.println("Matrícula foi achada com sucesso !" + "\n");

	}

	public void abrepdf() {
		try {

			File pdfFile = new File("C:\\Users\\Inmetrics\\Downloads\\00200598122017.pdf");
			if (pdfFile.exists()) {

				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfFile);
				} else {
					System.out.println("Awt Desktop não é suportado");
				}

			} else {
				System.out.println("O Arquivo não existe");
			}

			System.out.println("Feito" + "\n");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void lerpdf() throws IOException {
		Document document = new Document();
		PdfReader pdfReader = new PdfReader("C:\\Users\\Inmetrics\\Downloads\\00200598122017.pdf");
		String conteudo = PdfTextExtractor.getTextFromPage(pdfReader, 1);
		System.out.println(conteudo + "\n");
		document.close();

	}

	@Test
	public void realizaloga() throws IOException {

		String identificacao = "31798952840";
		String senha = "31798952840";
		inicializadriver();
		inicializasite();
		acoeslogin(identificacao, senha);
		driver.close();
		abrepdf();
		lerpdf();

	}

}
