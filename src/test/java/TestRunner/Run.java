package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("unused")
@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Features/AddNewCustomer.feature",".//Features/Login.feature"},
		glue="StepDefinition",
		dryRun=false,
		//tags="@Sanity",
		monochrome=true,
		plugin= {"pretty","html:target/CucumberReports/report16.html"}
		
		
		)


public class Run {
// this will remail empty
}
