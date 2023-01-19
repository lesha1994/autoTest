package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class SmokeCucumberStepdefs {

    @When("Cucumber is working")
    public void cucumberIsWorking() {
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://qa-pos.b2bsoft.com/";
    }

    @And("I sleep for {int} seconds")
    public void iSleepForSeconds(int arg0) {
//        open("/");
        sleep(arg0 * 1000L);
    }
}
