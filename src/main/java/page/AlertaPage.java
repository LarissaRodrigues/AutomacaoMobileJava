package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

public class AlertaPage extends BasePage {

	public void clicarAlertaConfirm() throws MalformedURLException {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void confirmar() throws MalformedURLException {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void sair() throws MalformedURLException {
		clicarPorTexto("SAIR");
	}
	
	public void clicarForaCaixa() throws MalformedURLException {
		tap(100,150);
	}
	
}
