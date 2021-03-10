package teste;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTeste;
import page.MenuPage;
import page.SplashPage;

public class SplashTeste extends BaseTeste {
	
	public MenuPage menu = new MenuPage();
	public SplashPage page = new SplashPage();
	
	@Test
	public void deveAguardarSplahsSumir() throws MalformedURLException {
		//acessar menu splah
		menu.acessaSplash();
		
		//verifica que o splash está sendo exibido
		page.isTelaSplashVisivel();
		
		//Aguardar a saida do shapsh
		page.aguardarSplashSumir();
		
		//Verifica que o formulario está aparecendo
		assertTrue(page.existeElementoPorTexto("Formulário"));
		
	}
	
}
