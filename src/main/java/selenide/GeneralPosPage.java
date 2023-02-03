package selenide;

import com.codeborne.selenide.Condition;
import constants.EnumTransactionFlowButtons;
import constants.EnumGeneralPageButtonsAndFields;
import constants.EnumSideBarsIconsAndButtonsName;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class GeneralPosPage extends BasePage {

    private static final String XPATH_TO_SIDEBAR_ITEMS = "//i[@class='nav__icon icon-%s']/ancestor::li[@class='nav__item']";

    public void clickSideIcon (EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName){
        $x(String.format(XPATH_TO_SIDEBAR_ITEMS,enumSideBarsIconsAndButtonsName.getValue())).should(Condition.visible, Duration.ofSeconds(20)).click();
        $x(String.format(XPATH_TO_DEVICE_SETTING,enumSideBarsIconsAndButtonsName)).click();
    }

    private static final String XPATH_TO_DEVICE_SETTING = "//span[text()= '%s']";





    public void clickInputField (EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
        $x(String.format(XPATH_TO_INPUT_BY_ID, enumGeneralPageButtonsAndFields.toString())).click();
    }


    private static final String XPATH_TO_PRODUCT = "//ul[@class='search-dropdown__list']//div[translate(normalize-space(text()), 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ') = \"%s\"]";

    public void clickOnProduct(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
        String locator = XPATH_TO_PRODUCT;
        if (enumGeneralPageButtonsAndFields.toString().contains("\"")) locator = locator.replace("\"", "'");
        $x(String.format(locator,enumGeneralPageButtonsAndFields.toString().toUpperCase())).click();

    }











    //private static final String XPATH_TO_MAKE_PAYMENT = "//button[@id = '%s']";

//    public void clickOnMakePayment(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
//        $x(String.format(XPATH_TO_BUTTON_BY_VALUE, enumGeneralPageButtonsAndFields.toString())).click();
//    }













}
