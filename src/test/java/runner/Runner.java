package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"steps", "hooks"},
        plugin = {
//                "json:build/cucumber.json",
                "rerun:src/test/java/rerun.txt",
                "html:build/site/cucumber-first.html"
        }
)
public class Runner {


}


