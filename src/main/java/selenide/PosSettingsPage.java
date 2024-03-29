package selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import constants.EnumPosSettingPage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class PosSettingsPage extends  BasePage {

    private static final String XPATH_TO_BUTTONS_BY_CLASS = "//button[@class = '%s']";

    private static final String XPATH_TO_DEVICE_TYPE = "//figure[@class = 'card']/p/span[text() ='%s']";

    private static final String XPATH_TO_PARTICULAR_TERMINAL = "//p[@class ='device_name']/span[text() = '%s']";

    private static final String XPATH_TO_TOGGLE = "//div[@class = '%s']";

    private static final String XPATH_TO_POP_UP = "//div[@class = '%s']";

    public void clickButtonOnSettingsPage(EnumPosSettingPage enumPosSettingPage){
        String locator = String.format(XPATH_TO_BUTTONS_BY_CLASS, enumPosSettingPage.toString());
        actions().moveToElement($x(locator)).pause(Duration.ofSeconds(3));
        System.out.println("Text from button: " + $x(locator + "//span").getText());
        //while (!$x("//span[text()='Terminals']").isDisplayed()) {
            $x(locator).shouldBe(Condition.visible).click();
        //}
        System.out.println();
    }

    public void clickButtonToChooseDeviceType(EnumPosSettingPage enumPosSettingPage){
        String locator = String.format(XPATH_TO_DEVICE_TYPE,enumPosSettingPage);
        $x(locator).hover();
        sleep(3000);
        $x(locator).click();
    }

    public void clickOnParticularTerminal(EnumPosSettingPage enumPosSettingPage){
        $x(String.format(XPATH_TO_PARTICULAR_TERMINAL, enumPosSettingPage)).click();
    }

    public void clickOnToggle(EnumPosSettingPage enumPosSettingPage){
        $x(String.format(XPATH_TO_TOGGLE,enumPosSettingPage)).click();
    }

    public void checkIfPopUpIsDisplayed(){
        $x(XPATH_TO_POP_UP).shouldBe(Condition.visible, Duration.ofSeconds(10));
    }


    private  static final  String XPATH_TO_DOTS_BUTTON = "//span[text() = 'Ingenico iSC250']/ancestor::tr//td[@class='%s']";

    public void clickOnDotsButton(EnumPosSettingPage enumPosSettingPage){
        $x(String.format(XPATH_TO_DOTS_BUTTON,enumPosSettingPage)).click();
    }



}
