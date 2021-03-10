package page;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;

import core.BaseTeste;
import core.DriverFactory;

public class WebViewPage {

	public void entrarComTextoWeb() throws MalformedURLException {
		Set<String> contextHandles = DriverFactory.getDriver().getContextHandles();
		for (String valor: contextHandles) {
			System.out.println(valor);
		}
		DriverFactory.getDriver().context((String) contextHandles.toArray()[1]);
	}
	
	public void setEmail(String valor) throws MalformedURLException {
		DriverFactory.getDriver().findElement(By.id("email")).sendKeys(valor);;
	}
	
	
	
}
