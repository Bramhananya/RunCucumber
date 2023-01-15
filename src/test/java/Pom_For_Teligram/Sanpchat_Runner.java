package Pom_For_Teligram;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Snapchat.feature" , glue = {"Pom_For_Teligram"})

public class Sanpchat_Runner {

}
