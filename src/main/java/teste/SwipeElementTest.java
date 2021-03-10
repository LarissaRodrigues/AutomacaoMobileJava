package teste;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import core.BaseTeste;
import junit.framework.Assert;
import page.MenuPage;
import page.SwipeElementPage;

public class SwipeElementTest extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private SwipeElementPage page = new SwipeElementPage(); 
	
	@Before
	public void acessaMenu() throws MalformedURLException {
		//acessar menu
	      menu.acessarSwipList();
	}
	
	@Test
	public void deveRealizarDesafio() throws MalformedURLException{
	   page.swipeElemenRight("Opção 1");
	   page.clicarNoBotaoMais();
	   Assert.assertTrue(page.existeElementoPorTexto("Opção 1 (+)"));
	   page.swipeElemenRight("Opção 4"); // page.clicarPorTexto("(-)");
   //    Assert.assertTrue(page.existeElementoPorTexto("Opção 4 (-)"));
       page.swipeElementLeft("Opção 5 (-)");
       Assert.assertTrue(page.existeElementoPorTexto("Opção 5"));

	}
	
	
	
	
	
}
