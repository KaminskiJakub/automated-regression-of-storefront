import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"stepDefs"},
        plugin = {"pretty", "html:reports/cucumber-report.html"},
        monochrome = true
)

public class TestRunner {

}
