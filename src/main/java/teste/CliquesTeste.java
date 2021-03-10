package teste;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import core.BaseTeste;
import junit.framework.Assert;
import page.CliquesPage;
import page.MenuPage;

public class CliquesTeste extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();
	
	@Before
	public void acessaMenu() throws MalformedURLException {
		//acessar menu
	    menu.acessarCliques();
	}
	
	@Test
	public void deveRealizarCliqueLongo() throws MalformedURLException{
		
		//clique longo
		page.cliqueLongos();
		//verificar texto
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}
	
	@Test
	public void deveRealizarCliqueDuplo() throws MalformedURLException {
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
	}
}
