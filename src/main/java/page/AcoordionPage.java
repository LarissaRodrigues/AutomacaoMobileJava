package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

public class AcoordionPage extends BasePage {

	public void selecionarPorTexto() throws MalformedURLException {
		clicarPorTexto("Opção 1");
		
	}
	
	public String obterValor() throws MalformedURLException {
		return obterTexto(By.xpath("//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}
	
}
