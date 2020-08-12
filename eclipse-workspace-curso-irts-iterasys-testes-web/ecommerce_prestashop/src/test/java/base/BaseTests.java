package base;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;

public class BaseTests {
	private static WebDriver driver;
	protected HomePage homePage;
	
	@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	//criar a pagina inicial
	@BeforeEach
	public void carregarPaginaInicial() {
		//referenciar o driver (conexao com o navegador)
		driver.get("http://marcelodebittencourt.com/demoprestashop/");
		homePage = new HomePage(driver);
	}
	
	@AfterAll
	public static void finalizar() {
		driver.quit();
	}

}

