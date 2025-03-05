package TestRunnerClass;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

			features = {"src\\test\\resources\\features\\Registration.feature"},
			glue = {"Stepdefination"},
			tags = "@All"
			)
			
public class Registrationrunner {

}
