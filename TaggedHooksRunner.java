package demos;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	//	features={"src/demos"},
	//	plugin={"html:src/reports/rep1.html","junit:src/reports/rep1.xml","json:src/reports/rep2.json"}
		tags= {"@Login"}
		
		)

public class TaggedHooksRunner {

}
