package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriverFactory;


public class MenuPage extends BasePage {

	public void acessarFormulario() throws MalformedURLException {
	  clicarPorTexto("Formulário");
		
	}
	
	public void acessaSplash() throws MalformedURLException {
		clicarPorTexto("Splash");
	}
	
	public void acessarAlerta() throws MalformedURLException {
		clicarPorTexto("Alertas");
	}
	
	public void acessarAbas() throws MalformedURLException {
		clicarPorTexto("Abas");
	}
	
	public void acessarAcordion() throws MalformedURLException {
		clicarPorTexto("Accordion");
	}
	
	public void acessarCliques() throws MalformedURLException {
		clicarPorTexto("Cliques");
	}
	
	public void acessarSwipe() throws MalformedURLException {
		clicarPorTexto("Swipe");
	}
	
	public void acessarSwipList() throws MalformedURLException {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		scrollDow();
		clicarPorTexto("Swipe List");
	}
	
	public void clicarDragNDrop() throws MalformedURLException {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		scrollDow();
		clicarPorTexto("Drag and drop");
	}
	
	public void acessarSBHibrido() throws MalformedURLException {
		clicarPorTexto("SeuBarriga Híbrido");
	}
}
	
