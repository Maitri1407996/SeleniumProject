package TestRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

			features = {"src\\test\\resources\\features\\order.feature"},
			glue = {"Stepdefination","Hooks"},
			tags = "@Smoke or @Regression",
			plugin = {"pretty"}
		)
public class OrderTestRunner {

}
