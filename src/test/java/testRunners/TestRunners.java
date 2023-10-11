package testRunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions
		(		features={".//SIT Features/SIT01-candidateassessment.feature"},
				glue={"stepDefinitions"},	
				
				//tags="@actac",			
				publish = true,
				dryRun=false,
			    monochrome =true,
//				plugin = {"pretty","html:target/editjob.html"}
			    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber.json"}
		)

public class TestRunners extends AbstractTestNGCucumberTests {

}
//candidateassessment.feature" ,".//SIT Features/fixedassessmentattempt.feature"   