package Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Cucumber.Cucumber.baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Featurefiles",
glue = "Stepdefintion",
dryRun = false,

plugin = {"pretty","html:target/report.html",
		"json:target/jsonreport/report.json",
		"junit:target/junitreport/junitreport.xml"})

 



public class runner_amazon {
	public static WebDriver driver;
	
	@BeforeClass
	public  static void setup() {
	  driver = baseclass.getbrowser("chrome");
	}
	
	
	
	
	
}

	
