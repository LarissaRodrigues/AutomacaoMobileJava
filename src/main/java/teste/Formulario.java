package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import core.BaseTeste;
import core.DriverFactory;
import io.appium.java_client.MobileBy;
import junit.framework.Assert;
import page.FormularioPage;
import page.MenuPage;

public class Formulario extends BaseTeste {

	
	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();

	@Before
	public void InicializarApiun() throws MalformedURLException {
        menu.acessarFormulario();
	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		/*
		 * List<MobileElement> elementosEncontrados =
		 * driver.findElements(By.className("android.widget.TextView"));
		 * 
		 * for(MobileElement elemento: elementosEncontrados) {
		 * System.out.println(elemento.getText()); }
		 * 
		 * elementosEncontrados.get(1).click();
		 */
		page.escreverNome("Larissa");
	
		/*
		 * MobileElement campoNome =
		 * driver.findElement(MobileBy.AccessibilityId("nome"));
		 * campoNome.sendKeys("Larissa");
		 */

		assertEquals("Larissa", page.obterNome());

	}

	@Test
	public void devePreencherCombo() throws MalformedURLException {

		page.selecionarCombo("Nintendo Switch");
				
		String text = page.obterValorCombo();
		assertEquals("Nintendo Switch", text);

	}

	@Test
	public void deveInteragirSwitCheck() throws MalformedURLException {
		
		assertFalse(page.isCheckMarcado());
		assertTrue(page.isSwitchMarcado());
		
		page.clicarCheck();
	    page.clicarSwitch();
		
		assertTrue(page.isCheckMarcado());
		assertFalse(page.isSwitchMarcado());

	}

	@Test
	public void deveRealizarCadastro() throws MalformedURLException {

		
		page.escreverNome("Larissa");
		page.clicarCheck();
		page.clicarSwitch();
		page.selecionarCombo("Nintendo Switch");
//	    dsl.escrever(MobileBy.AccessibilityId("nome"), "Larissa");
//		dsl.clicar(MobileBy.AccessibilityId("check"));
//		dsl.clicar(MobileBy.AccessibilityId("switch"));
//		dsl.selecionarCombo(MobileBy.AccessibilityId("console"), "Nintendo Switch");

        page.selecionaPorTexto("SALVAR");      
//		dsl.clicarPorTexto("SALVAR");
	
        assertEquals("Nome: Larissa", page.obterNomeCadastrado());
        Assert.assertEquals("Console: switch", page.obterConsole());
        Assert.assertEquals("Slider: 25", page.obterTextoSline());  
        Assert.assertEquals("Switch: Off", page.obterSwitCadastrado());
        Assert.assertEquals("Checkbox: Marcado", page.obterCheckCadastrado());
        Assert.assertEquals("Data: 01/01/2000", page.obterData());
        Assert.assertEquals("Hora: 06:00", page.obterHora());
        
        
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Nome: Larissa']"));
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Console: switch']"));
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Slider: 25']"));
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Switch: Off']"));
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Checkbox: Marcado']"));
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Data: 01/01/2000']"));
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Hora: 06:00']"));

	}
	
	
	@Test
	public void deveRealizarCadastroDemorado() throws MalformedURLException {
	
		page.escreverNome("Larissa");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        page.salvarDemorado();      
        esperar(30000);
	
        assertEquals("Nome: Larissa", page.obterNomeCadastrado());  
	}
	
	@Test
	public void deveAlterarData() throws MalformedURLException {
		page.clicarPorTexto("01/01/2000");
		page.clicarPorTexto("20");
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("20/2/2000"));
	}

	@Test
	public void deveAlterarHora() throws MalformedURLException {
		page.clicarPorTexto("06:00");
		page.clicar(MobileBy.AccessibilityId("10"));
		page.clicar(MobileBy.AccessibilityId("40"));
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("10:40"));
	}
	
	@Test
	public void deveInteragirComSeekbar() throws MalformedURLException {
		//clicar no seekbar
		page.clicarSeekBar(0.05);
		//salvar
		page.selecionaPorTexto("SALVAR");  
		//obter o valor
	}
	
}
