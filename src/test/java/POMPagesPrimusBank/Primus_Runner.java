package POMPagesPrimusBank;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Feature\\InstagramLogin.feature", glue= {"POMPagesPrimusBank"})

public class Primus_Runner {

	
	
}
