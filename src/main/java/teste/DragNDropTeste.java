package teste;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTeste;
import page.DragDropPage;
import page.MenuPage;

public class DragNDropTeste extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private DragDropPage page = new DragDropPage();
	
	private String[] estadoInicial = new String[] {
			"Esta",
			"é uma lista",
			"Drag em Drop!",
			"Faça um clique longo,",
			"e arraste para",
			"qualquer local desejado."};
	
	private String[] estadoIntermediario = new String[] {
			"é uma lista",
			"Drag em Drop!",
			"Faça um clique longo,",
			"e arraste para",
			"Esta",
			"qualquer local desejado."};
	
	private String[] estadoFinal = new String[] {
			"Faça um clique longo,",
			"é uma lista",
			"Drag em Drop!",
			"e arraste para",
			"Esta",
			"qualquer local desejado."};
	
	@Test
	public void deveEfetuarDragNDrop() throws MalformedURLException {
		//Acessar menu
		 menu.clicarDragNDrop();
		
		//verficar estado inicial
		 esperar(1000);
	
		 //	page.obterLista();
		Assert.assertArrayEquals(estadoInicial, page.obterLista());
		
		//arastar esta para arraste para
		page.arrastar("Esta", "e arraste para");
		
		//verificar estado intermediario
		 esperar(1000);
		Assert.assertArrayEquals(estadoIntermediario , page.obterLista());
		
		//arrastar faça um clique longo para é uma lista
		page.arrastar("Faça um clique longo,", "é uma lista");
		
		//verificar estado final
		 esperar(1000);
		Assert.assertArrayEquals(estadoFinal , page.obterLista());
		
		
		
	}
	
}
