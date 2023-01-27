package selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import constants.EnumSideBarsIconsAndButtonsName;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class TimeClockPage extends  BasePage {
    protected static final String XPATH_TO_BUTTON_IN_TIMECLOCK_APP = "//button[text() = 'Start Lunch']";


    public void checkThatTimeClockAppDisplayed(){
        Selenide.switchTo().frame("generalIframeForApps");
        $x(XPATH_TO_BUTTON_IN_TIMECLOCK_APP).shouldBe(Condition.visible, Duration.ofSeconds(10));
        Selenide.switchTo().defaultContent();
    }
}
