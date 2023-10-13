package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "stepDefinition",
        dryRun=false,
        plugin= {"html:target/test"}
        )

public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}
