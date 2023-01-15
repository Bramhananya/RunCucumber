package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Login.feature" , glue= {"StepDefinations"},

monochrome = true,
plugin = {"pretty","junit:target/JunitReport/report.xml",
		    
		  "json:target/JsonReport/Report.Json",

           "html:targrt/Htmlreport"},
                                         
tags= "@SanityTest")

public class FacebookRunner {

	
		
}
