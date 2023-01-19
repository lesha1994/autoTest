package selenide;

import com.codeborne.selenide.Condition;
import constants.EnumLoginFields;
import constants.EnumSideBarsIconsAndButtonsName;
import constants.IForEnumButtonsValue;
import constants.IForEnumInputFields;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    protected static final String XPATH_TO_BUTTON_BY_VALUE = "//button [@* ='%s']";

    protected static final String XPATH_TO_INPUT_BY_ID = "//input[@id='%s']";

    protected static final String XPATH_TO_SIDEBAR_MENU = "//div[@class = 'menu__container']";

    // //div[@class='tableBody tableGrid']/div[1]/div[2]/p - локатор для транзакции в транказшн листе

    public void inputInField(IForEnumInputFields enumLoginField, String value) {
        $x(String.format(XPATH_TO_INPUT_BY_ID,  enumLoginField.toString())).should(Condition.visible, Duration.ofSeconds(10)).sendKeys(value);
    }

    public void clickButton(IForEnumButtonsValue enumLoginButton) {
        $x(String.format(XPATH_TO_BUTTON_BY_VALUE, enumLoginButton.toString())).click();

    }

    public  void findElementOnLoginPage(EnumLoginFields enumLoginFields){
        $x(String.format(XPATH_TO_INPUT_BY_ID, enumLoginFields.toString())).should(Condition.visible, Duration.ofSeconds(10));
    }


    public void checkSideBarOnGeneralPogPageIsDisplayed(EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName){
        $x(XPATH_TO_SIDEBAR_MENU).shouldBe(Condition.disappear, Duration.ofSeconds(10));
        $x(XPATH_TO_SIDEBAR_MENU).shouldBe(Condition.visible, Duration.ofSeconds(10));
    }


    public  void   getLastId (){


    }





}
