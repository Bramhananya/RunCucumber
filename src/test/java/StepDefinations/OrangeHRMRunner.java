package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Feature\\OrangeHRM.feature" , glue = {"StepDefinations"} ,

	monochrome = true ,
	
	plugin = {"pretty","junit:target/JunitHRM.report.xml",
		    
			  "json:target/OrangeHrmLoginReport/JsonHRM.report",

	           "html:targrt/OrangeHRMreport"},
	
	dryRun = false
		)

public class OrangeHRMRunner {

}
