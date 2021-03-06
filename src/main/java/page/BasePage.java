package page;

import static core.DriverFactory.getDriver;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class BasePage {

	//metos genericos, quem precisar vai vim pegar aqui
	
	public void escrever (By by, String texto) throws MalformedURLException {
	    getDriver().findElement(by).sendKeys(texto);
	}
	
	public String obterTexto(By by) throws MalformedURLException {
		return getDriver().findElement(by).getText(); 
	}
	
	public void clicar (By by) throws MalformedURLException {
		getDriver().findElement(by).click();
	}
	
	public void selecionarCombo(By by, String valor) throws MalformedURLException {
		getDriver().findElement(by).click();
		clicarPorTexto(valor);
	}
	
	public void clicarPorTexto(String texto) throws MalformedURLException {
		clicar(By.xpath("//*[@text='"+texto+"']"));
	}
	
	public boolean isCheckMarcado(By by) throws MalformedURLException {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
	public boolean existeElementoPorTexto(String texto) throws MalformedURLException {
		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
		 return elementos.size() > 0;
	}
	
	public void tap(int x, int y) throws MalformedURLException {
		new TouchAction(getDriver()).tap(x, y).perform();
	}
	
	public void scroll(double inicio,  double fim ) throws MalformedURLException {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();
		
		int x = size.width / 2;
		
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);
		
		new TouchAction(getDriver()).press(x, start_y).waitAction(Duration.ofMillis(500)).moveTo(x, end_y).release().perform();
			
	}
	
	public String obterTituloAlert() throws MalformedURLException {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlert() throws MalformedURLException {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void swipe(double inicio, double fim) throws MalformedURLException {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();
		
		int y = size.height / 2;
		
		int start_x = (int) (size.width * inicio);
		int end_x = (int) (size.width * fim);
		
		new TouchAction(getDriver()).press(start_x, y).waitAction(Duration.ofMillis(500)).moveTo(end_x, y).release().perform();
	}
	
	public void scrollDow() throws MalformedURLException {
		scroll(0.9,0.1);
	}
	
	public void scrolUp() throws MalformedURLException {
		scroll(0.1,0.9);
	}
	
	public void swipeLeft() throws MalformedURLException {
		swipe(0.1,0.9);
	}
	
	public void swipeRight() throws MalformedURLException {
		swipe(0.9,0.1);
	}
	
	public void swipeElemnt(MobileElement element, double inicio, double fim) throws MalformedURLException {
        int y = element.getLocation().y +(element.getSize().height)/2;
		
		int start_x = (int) (element.getSize().width * inicio);
		int end_x = (int) (element.getSize().width * fim);
		
		new TouchAction(getDriver()).press(start_x, y).waitAction(Duration.ofMillis(500)).moveTo(end_x, y).release().perform();
	}
	
}
