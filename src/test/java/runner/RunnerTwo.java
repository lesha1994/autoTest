package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@src/test/java/rerun.txt",
        glue = {"steps", "hooks"},
        plugin = {
//                "json:build/cucumber.json",
                "rerun:src/test/java/reruntwo.txt",
                "html:build/site/cucumber-second.html"
        }
)
public class RunnerTwo {
}
