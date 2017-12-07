package pageobject;

public class FrequenciaPage extends LoginPage{

	public String gerarespelho = "/html/body/table/tbody/tr[1]/td[2]/a/img";
	protected String UrlBase = "https://aplic.inmetrics.com.br//requerimento/content/login.php";
    public String campofuncionario = "//*[@id=\"frequencia\"]/tbody/tr[2]/td/table[1]/tbody/tr[4]/td[1]";
    public String campomatricula = "//*[@id=\"frequencia\"]/tbody/tr[2]/td/table[1]/tbody/tr[5]/td[1]";
    
    protected String getUrlBase() {
		return UrlBase;
	}
	protected void setUrlBase(String urlBase) {
		UrlBase = urlBase;
	}
}