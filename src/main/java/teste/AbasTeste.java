package teste;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTeste;
import page.AbaPage;
import page.MenuPage;

public class AbasTeste extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private AbaPage page = new AbaPage();
	
	@Test
	public void deveInteragirComAbas() throws MalformedURLException {
		//verificar menu abas
		menu.acessarAbas();
		//verificar que está na aba 1
		Assert.assertTrue(page.isAba1());
		//acessar aba 2
		page.selecionarAba2();		
		//verificar que está na aba 2
		Assert.assertTrue(page.isAba2());
		
	}
	
	
}
