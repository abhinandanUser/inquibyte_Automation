package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Administrator/eclipse-workspace/Incubyte_Automation/./Features/Compose.feature",
		glue = "stepDefinations",
		dryRun= false,
		monochrome= true,
		plugin = {"pretty"}
		)

public class Run {

}
