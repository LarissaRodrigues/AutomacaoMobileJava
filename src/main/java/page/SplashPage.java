package page;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.DriverFactory;

public class SplashPage extends BasePage {

	public boolean isTelaSplashVisivel() throws MalformedURLException {
		return existeElementoPorTexto("Splash!");
	}
	
	public void aguardarSplashSumir() throws MalformedURLException {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Splash!')]")));	
	}

	
	
	
}
