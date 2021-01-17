package br.com.provaInterasys.mobile.screnFactory;


import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;




public class screenPageFactory {
	
	private WebDriver driver;
	private WebElement element;
	

	public void PagePesquisaPorMassa(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.XPATH, using ="//android.widget.FrameLayout[@content-desc=\"Departamentos\"]/android.widget.ImageView")
	private WebElement clicarDepart;
	
	
	@FindBy(how= How.XPATH, using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.view.ViewGroup/android.widget.TextView")
	private WebElement clicarEletro;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.TextView")
	private WebElement clicarGelad;
	
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.TextView")
	private WebElement clicarPort;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ViewFlipper/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement selecionarProd;
	
	
	@FindBy(how = How.ID, using = "com.novapontocom.extra:id/textViewProductName")
	private WebElement validarProd;
	
	@FindBy(how = How.ID, using = "com.novapontocom.extra:id/button")
	private WebElement clicarComprar;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat")
	private WebElement clicarContinuar;
	
	@FindBy(how = How.ID, using = "com.novapontocom.extra:id/textViewProductName")
	private WebElement validarTest;
	
	public void clicarDepart() {

		clicarDepart.click();
	}
	public void clicarEletro() {
		
		clicarEletro.click();
	}
	
	
	public void clicarGelad() {
	
		clicarGelad.click();
	}

	public void clicarPort() {
		
		clicarPort.click();
	}

	public void selecionarProd() {
		
		selecionarProd.click();
	}
	
	public String validarProd() {
		
		return validarProd.getText();
	}
	

	public void clicarComprar() {
	
		
		clicarComprar.click();
	}
	
	public void Enter() throws MalformedURLException {
		
	(new TouchAction(driverScreen.InicializaDriver())).tap(PointOption.point(509, 1298)).perform();
	
	}
	public void clicarContinuar() {
		
		clicarContinuar.click();
	}
	
	public String validarTest() {
		
		return validarTest.getText();
	}
}
