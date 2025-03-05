package TestRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

			features = {"src\\test\\resources\\features\\Uber.feature"},
			glue = {"Stepdefination","Hooks"},
			tags = "@All",
			plugin = {"pretty",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"}
			
			//publish = true//for publish link
			//monochrome = true//for alignment
			//dryRun = true//giving error or highlighting the error on console when we miss any step definition
		
		)


public class UberRunnerClass {

}	
