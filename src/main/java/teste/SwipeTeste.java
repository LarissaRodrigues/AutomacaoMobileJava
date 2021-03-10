package teste;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTeste;
import page.MenuPage;

public class SwipeTeste extends BaseTeste {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() throws MalformedURLException {
		//acessar menu
		menu.acessarSwipe();
			
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		//swipe para a direita
		menu.swipeRight();
		//verificar texto ' E veja se'
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
		//clicar botão direita
		menu.swipeRight();
		// Verificar o texto 'Chegar até o fim'
		Assert.assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
		//swipe esquerda
		menu.swipeLeft();
		//clicar no botão da esquerda
		menu.swipeLeft();
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
	}
	
}

