package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@LoginScenarios",
        features = {"src/test/resources/features/"},
        glue = "stepDefinitions",
        monochrome = true,
        dryRun = false,
        publish = true,
        plugin = {
                "pretty",
                "html:target/ParallelReports/SeleniumTraining.html",
                "json:target/ParallelReports/SeleniumTraining.json"
        }
)
public class TestRunner {
}
