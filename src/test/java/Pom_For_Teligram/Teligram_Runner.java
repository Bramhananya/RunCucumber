package Pom_For_Teligram;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\TeligramLogin.feature" , glue = {"Pom_For_Teligram"})

public class Teligram_Runner {

}
