package Fb_Steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Feature\\faceboolk.feature" , glue = {"Fb_Steps"})

public class ShreekantRunnerfb {

}
