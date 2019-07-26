package cucumberPC;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:created_features/pc_login.feature"},
        glue = {"classpath:stepdefs"},
        plugin = {"pretty"})
public class RunCucumberTest {

}
