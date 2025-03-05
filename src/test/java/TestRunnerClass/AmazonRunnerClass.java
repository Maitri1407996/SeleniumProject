package TestRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

			features = {"src\\test\\resources\\features\\search.feature"},
			glue = {"Stepdefination"},
			plugin = {"pretty"}
		)

public class AmazonRunnerClass {

}
