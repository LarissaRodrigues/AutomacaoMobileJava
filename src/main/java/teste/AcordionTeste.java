package teste;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTeste;
import page.AcoordionPage;
import page.MenuPage;

public class AcordionTeste extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private AcoordionPage page = new AcoordionPage();
	
	@Test
	public void deveInteragirComAcordion() throws MalformedURLException {
		//acessar o menu
	    menu.acessarAcordion();
		
		//clicar opção 1
		page.selecionarPorTexto();
	    
		// verificar texto opção 1
		esperar(1000);
		Assert.assertEquals("Esta é a descrição da opção 1", page.obterValor());
	    
	}
	
	
}
