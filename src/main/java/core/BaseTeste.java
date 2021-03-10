package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

public class BaseTeste {

	@Rule
	public TestName testName = new TestName();
	
	@AfterClass
	public static void finalizarClasse() {
		killDriver();
	}
	
	@After
	public void tearDown() throws MalformedURLException {
		gerarScreenShot();
		getDriver().resetApp();
	}
	//((TakeScreenshot)
	public void gerarScreenShot() throws WebDriverException, MalformedURLException {
		File imagem =  DriverFactory.getDriver().getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, new File("target/screenshots/"+testName.getMethodName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
