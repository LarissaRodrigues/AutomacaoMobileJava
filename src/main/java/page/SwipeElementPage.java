package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class SwipeElementPage extends BasePage {

	public void swipeElementLeft(String opcao) throws MalformedURLException {
		swipeElemnt(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
		
	}
	
	public void swipeElemenRight(String opcao) throws MalformedURLException {
		swipeElemnt(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
		
	}
	
	public void clicarNoBotaoMais() throws MalformedURLException {
		MobileElement botao = DriverFactory.getDriver().findElement(By.xpath("//*[@text='(+)']/.."));
		new TouchAction(DriverFactory.getDriver()).tap(botao, -50, 0).perform();
	}
	
}
