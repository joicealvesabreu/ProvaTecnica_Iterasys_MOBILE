package br.com.provaInterasys.mobile.screenStep;



import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




import br.com.provaInterasys.mobile.screnFactory.driverScreen;
import br.com.provaInterasys.mobile.utility.generator;

import com.cucumber.listener.Reporter;


import cucumber.api.Scenario;
import cucumber.api.java.After;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class hook {

	
	public AndroidDriver<MobileElement> driver;

	
	public void hook() {
		
		this.driver = driver;

	}
	

	@After(order =0)
	public void finaliza() {

	//	driver = DriverFactory.FechandoDriver();
	}

	@After(order = 1)
	public void finalizarreport(Scenario scenario) throws Exception, MalformedURLException {
		
		File screenshot = ((TakesScreenshot) driverScreen.InicializaDriver()).getScreenshotAs(OutputType.FILE);
		String caminho = System.getProperty("user.dir") + "/cucumber-reports/screenshots/" + scenario.getName() + "-"
				+ generator.dataHoraParaArquivo() + ".png";
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
			Reporter.addScreenCaptureFromPath(caminho.toString());
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
	}
}
