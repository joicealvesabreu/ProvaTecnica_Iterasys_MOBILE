package br.com.provaInterasys.mobile.run;



import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)   
@CucumberOptions(features = "src/test/resources/feature", 
glue = { "br.com.provaInterasys.mobile.screenStep"},
tags = {"@pesquisa"},
plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html"}, 
monochrome = true)

public class testRun {

	
}
