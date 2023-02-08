package selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import constants.EnumTransactionFlowButtons;
import constants.EnumGeneralPageButtonsAndFields;
import constants.EnumSideBarsIconsAndButtonsName;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class GeneralPosPage extends BasePage {

    private static final String XPATH_TO_SIDEBAR_ITEMS = "//i[@class='nav__icon %s']/ancestor::li[@class='nav__item']";

    public void clickSideIcon (EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName){
        System.out.println();
        $x(String.format(XPATH_TO_SIDEBAR_ITEMS,enumSideBarsIconsAndButtonsName.getValue())).should(Condition.visible, Duration.ofSeconds(20)).click();
        System.out.println();
    }

    private static final String XPATH_TO_DEVICE_SETTING = "//span[text()= '%s']";


    public void clickExpandedDropdownItem(EnumSideBarsIconsAndButtonsName parent, EnumSideBarsIconsAndButtonsName child) {
        String locatorToChildItem = String.format("(//i[@class='nav__icon %s']/ancestor::li[@class='nav__item']//div[contains(@class,'nav__link')]//span[text()][not(descendant::*)])[%s]", parent.getValue(), child.getValue());
        sleep(3000);
        $x(locatorToChildItem).shouldBe(Condition.visible).click();
        if (child == EnumSideBarsIconsAndButtonsName.DEVICE_SETTINGS)
            Selenide.switchTo().frame("settingsIframe");

    }



    public void clickInputField (EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
        $x(String.format(XPATH_TO_INPUT_BY_ID, enumGeneralPageButtonsAndFields.toString())).click();
    }


    private static final String XPATH_TO_PRODUCT = "//ul[@class='search-dropdown__list']//div[translate(normalize-space(text()), 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ') = \"%s\"]";

    public void clickOnProduct(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
        String locator = XPATH_TO_PRODUCT;
        if (enumGeneralPageButtonsAndFields.toString().contains("\"")) locator = locator.replace("\"", "'");
        $x(String.format(locator,enumGeneralPageButtonsAndFields.toString().toUpperCase())).click();

    }

    public void switchToMainContent() {
        Selenide.switchTo().defaultContent();
    }


    //private static final String XPATH_TO_MAKE_PAYMENT = "//button[@id = '%s']";

//    public void clickOnMakePayment(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
//        $x(String.format(XPATH_TO_BUTTON_BY_VALUE, enumGeneralPageButtonsAndFields.toString())).click();
//    }













}
