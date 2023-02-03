package selenide;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import constants.EnumGeneralPageButtonsAndFields;
import constants.EnumLoginButtonsAndDropdowns;
import constants.EnumLoginFields;
import constants.IForEnumInputFields;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage {



    private static final String XPATH_TO_OPEN_OR_CLOSE_REGISTER_BUTTON = "(//i[@class='nav__icon icon-cash-register']/ancestor::li[@class='nav__item']//div[@class='nav__link']//span[text()][not(descendant::*)])[1]";



    public void clickDropdown(EnumLoginButtonsAndDropdowns enumLoginButtonsAndDropdowns) {
        String locator = String.format("//label[text() = '%s']/..//div[@class='dropdown__header']", enumLoginButtonsAndDropdowns.toString());
        System.out.println(locator);
        $x(locator).click();
    }

    public void chooseValueInDropdown(String value) {
        $x(String.format("//div[@class='dropdown-menu is-open']//li[text()='%s']", value)).click();
    }

    public boolean cashRegisterIsOpened() {

        String textFromElementCashRegister = $x(XPATH_TO_OPEN_OR_CLOSE_REGISTER_BUTTON).should(Condition.visible, Duration.ofSeconds(20)).getText();
        System.out.println("Cash Register: " + textFromElementCashRegister);

        return textFromElementCashRegister.contains("Close");
    }

    public void clickOnCloseOrOpenRegisterButton() {
        $x(XPATH_TO_OPEN_OR_CLOSE_REGISTER_BUTTON).click();
    }


}






