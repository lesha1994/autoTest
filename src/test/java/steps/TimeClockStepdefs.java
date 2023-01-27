package steps;

import constants.EnumSideBarsIconsAndButtonsName;
import io.cucumber.java.en.And;
import selenide.GeneralPosPage;
import selenide.TimeClockPage;
import selenide.TransactionFlowPage;

public class TimeClockStepdefs {
    TimeClockPage timeClockPage = new TimeClockPage();

    @And("I check that Time Clock page is opened")
    public void iCheckIfTitleOfTimeClockDisplayOnScreen() {
        timeClockPage.checkThatTimeClockAppDisplayed();
    }
}
