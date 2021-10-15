package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature"
		,glue= {"StepDefinition","Hooks"},
		
plugin= {"pretty", "html:target/cucumber-pretty", "junit:target/report.xml", "json:target/cucumber.json"})

public class TestRunner1 {

}
