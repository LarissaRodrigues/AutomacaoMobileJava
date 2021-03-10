package teste;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.BaseTeste;
import page.AlertaPage;
import page.MenuPage;

public class AlertTest extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();

	@Before
	public void setUp() throws MalformedURLException {
		menu.acessarAlerta();
	}
	
	
	@Test
	public void deveConfirmarAlerta() throws MalformedURLException {
		
		// clicar em allert confirme
		page.clicarAlertaConfirm();
		// verificar os textos
		Assert.assertEquals("Info", page.obterTituloAlert());
		Assert.assertEquals("Confirma a operação?", page.obterMensagemAlert());
		// confirmar o alerta
		page.confirmar();
		// verificar nova mensagem
		Assert.assertEquals("Confirmado", page.obterMensagemAlert());
		// sair
		page.sair();

	}

	@Test
	public void deveClicarForaAlerta() throws MalformedURLException {
		// clicar alerta simples
          page.clicarPorTexto("ALERTA SIMPLES");
		// clicar fora da caixa
        // CLICAR EM 100 E 150
          esperar(1000);
          page.clicarForaCaixa();
		// verificar que a mensagem não existe mais
         Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair")); 
	}

}
