package FreeCRMRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\Baji786\\eclipse-workspace\\FreeCRMProject\\src\\test\\java\\FreeCRMLFeature\\FeeCRMFeature.feature",
		glue= {"FreeCRMLoginPageStepDef"}
				//tags="@FreeCRM_Tool"
				//dryRun=false
		)

public class RuunerClass {
	

}
