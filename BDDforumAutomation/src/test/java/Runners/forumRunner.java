package Runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
//import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\java\\Features",
	glue= {"stepDef"},

	plugin = {"pretty", "html:target/htmlreports", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	monochrome=true,

	strict=true,
	dryRun=false
	//, tags={"@SmokeTest"}
	
			)
	

public class forumRunner 
{
	
	@AfterClass
    public static void writeExtentReport() {
    Reporter.loadXMLConfig(new File("config/report.xml"));


}
}
