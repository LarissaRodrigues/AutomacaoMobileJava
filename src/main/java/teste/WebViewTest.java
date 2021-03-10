package teste;

import java.net.MalformedURLException;

import org.junit.Test;

import core.BaseTeste;
import page.MenuPage;
import page.WebViewPage;

public class WebViewTest extends BaseTeste{

	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void deveFazerLoguin() throws MalformedURLException {
		//acessar o menu
		menu.acessarSBHibrido();
		esperar(3000);
		page.entrarComTextoWeb();
		//preecher email
		
		page.setEmail("a@a");
		//senha
		
		//entrar
		
		//verificar mensagem de sucesso
		
	}
	
	
	
}
