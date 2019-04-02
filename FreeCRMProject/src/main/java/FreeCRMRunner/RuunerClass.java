package FreeCRMRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="E:\\FreeCRMProject\\FreeCRMProject\\src\\test\\java\\FreeCRMLFeature",
		glue= {"FreeCRMLoginPageStepDef"}
				
		)

public class RuunerClass {
	

}
