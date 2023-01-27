package tests;

import com.codeborne.selenide.Configuration;
import constants.EnumLoginButtonsAndDropdowns;
import constants.EnumLoginFields;
import org.junit.Before;
import org.junit.Test;
import selenide.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class SelenideTest {

    @Before
    public void configurationSelenide() {
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://qa-pos.b2bsoft.com/";
        open("/");
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.inputInField(EnumLoginFields.ACCESS_CODE, "9905400");
        loginPage.clickButtonByAttributeValueWithoutAttributeName(EnumLoginButtonsAndDropdowns.CONTINUE);
        loginPage.inputInField(EnumLoginFields.USERNAME, "testadmin");
        loginPage.inputInField(EnumLoginFields.PASSWORD, "Test123456");
        loginPage.clickButtonByAttributeValueWithoutAttributeName(EnumLoginButtonsAndDropdowns.LOGIN);
        loginPage.clickButtonByAttributeValueWithoutAttributeName(EnumLoginButtonsAndDropdowns.STORE);

        sleep(8000);
    }
}
