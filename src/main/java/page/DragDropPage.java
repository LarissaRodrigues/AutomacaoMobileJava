package page;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;

import core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class DragDropPage extends BasePage {

	public void arrastar (String origem, String destino) throws MalformedURLException {
		MobileElement inicio = DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+origem+"']"));
		MobileElement fim = DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+destino+"']"));
		
		new TouchAction(DriverFactory.getDriver()).longPress(inicio).moveTo(fim).release().perform();
	}
	
	public String[] obterLista() throws MalformedURLException {
		List<MobileElement> elements = DriverFactory.getDriver().findElements(By.className("android.widget.TextView"));
		String[] retorno = new String[elements.size()];
		for (int i = 0 ; i < elements.size(); i ++) {
			retorno[i]= elements.get(i).getText();
		//	System.out.println("\""+retorno[i]+"\",");
		}
		return retorno;
	}
	
}
 
