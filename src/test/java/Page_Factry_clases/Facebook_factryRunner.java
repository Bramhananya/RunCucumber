package Page_Factry_clases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Facebook_factry.feature" , glue = {"Page_Factry_clases"})

public class Facebook_factryRunner {

}
