package cucumberPC;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:created_features/pc_create_account.feature"},
        glue =     {"classpath:stepdef_create_account"},
        plugin = {"pretty"})
public class RunCucumberTest {

}
