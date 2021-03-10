package teste;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseTeste;
import core.DriverFactory;
import page.MenuPage;

public class OpcaoEscondidaTeste extends BaseTeste {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() throws MalformedURLException {
		//scroll down
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		System.out.println("Começando");
		menu.scrollDow();
		//clicar menu
		menu.clicarPorTexto("Opção bem escondida");
		//verificar mensagem
		Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlert());
		//sair
		menu.clicarPorTexto("OK");
	}
	
}
