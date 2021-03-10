package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import core.DriverFactory;
import io.appium.java_client.TouchAction;

public class CliquesPage extends BasePage {

	
	public void cliqueLongos() throws MalformedURLException {
	  	new TouchAction(DriverFactory.getDriver()).longPress(DriverFactory.getDriver().findElement(By.xpath("//*[@text='Clique Longo']"))).perform();
	}
	
	public String obterTextoCampo() throws MalformedURLException {
		return DriverFactory.getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
				
	}
	
	
	
}
