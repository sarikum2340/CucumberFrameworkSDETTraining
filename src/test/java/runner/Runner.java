package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Loginfeature/Login.feature" }, glue= {"testCases"},
//dryRun = true, // to check if we have missed any																								// steps
monochrome = true, // to get console in order
strict = true// check if any step is not defined in step definition
		)

//
public class Runner {

}
