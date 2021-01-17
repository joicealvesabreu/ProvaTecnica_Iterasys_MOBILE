package br.com.provaInterasys.mobile.screenStep;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import br.com.provaInterasys.mobile.screnFactory.driverScreen;
import br.com.provaInterasys.mobile.screnFactory.screenPageFactory;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class testScreen {

	public screenPageFactory lupa;

	public AndroidDriver<MobileElement>driver;
	
	public testScreen() throws MalformedURLException {
		driver = driverScreen.InicializaDriver();
		lupa = PageFactory.initElements(driver, screenPageFactory.class);
	}

	@Dado("^eu clicar em departamentos$")
	public void eu_clicar_em_departamentos() throws Throwable {
		lupa.clicarDepart();
	}

	@Quando("^eu clicar em Eletromesticos$")
	public void eu_clicar_em_Eletromesticos() throws Throwable {
		lupa.clicarEletro();
	}

	@Quando("^clicar em geladeira$")
	public void clicar_em_geladeira() throws Throwable {
		 lupa.clicarGelad();
	}

	@Quando("^clicar em duas portas$")
	public void clicar_em_duas_portas() throws Throwable {
		lupa.clicarPort();
	}

	@Quando("^clicar no produto esperado$")
	public void clicar_no_produto_esperado() throws Throwable {
		 lupa.selecionarProd();
	}


	@Entao("^aparecerar produto na tela$")
	public void aparecerar_produto_na_tela() throws Throwable {
			String ValidarProduto =lupa.validarProd();
			Assert.assertEquals("Refrigerador Electrolux Duplex DC35A 260L - Branco", ValidarProduto);
	}
}
