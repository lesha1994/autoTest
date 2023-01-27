package steps;

import com.codeborne.selenide.Configuration;
import constants.EnumLoginButtonsAndDropdowns;
import constants.EnumLoginFields;
import constants.EnumSideBarsIconsAndButtonsName;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import selenide.GeneralPosPage;
import selenide.LoginPage;
import utils.ReadProperty;

import static com.codeborne.selenide.Selenide.open;

public class LoginAndLogoutStepdefs {

    LoginPage loginPage = new LoginPage();
    GeneralPosPage generalPosPage = new GeneralPosPage();

    @When("Login page is opened")
    public void loginPageIsOpened() {
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://qa-pos.b2bsoft.com";
        open("/");
    }

    @And("I input in field {} value")
    public void iInputInFieldValue(EnumLoginFields enumLoginFields) {
        String propertyName = enumLoginFields.name().toLowerCase();
        String propertyValue = ReadProperty.getPropertyFromFile("login", propertyName);
        loginPage.inputInField(enumLoginFields, propertyValue);
    }

    @And("I input in field {} value in string {string}")
    public void iInputInfieldValueInString(EnumLoginFields enumLoginFields, String value) {
        System.out.println();
        loginPage.inputInField(enumLoginFields, value);
        System.out.println();
    }

    @And("I click {} button on Login Page")
    public void iClickButton(EnumLoginButtonsAndDropdowns enumLoginButtonsAndDropdowns) {
        System.out.println();
        loginPage.clickButtonByAttributeValueWithoutAttributeName(enumLoginButtonsAndDropdowns);
        System.out.println();
    }

    @And("I click {} dropdown")
    public void iClickDropdownOrButton(EnumLoginButtonsAndDropdowns enumLoginButtonsAndDropdown) {
        System.out.println();
        loginPage.clickDropdown(enumLoginButtonsAndDropdown);
        System.out.println();
    }

    @And("I click dropdown item by {string} value in dropdown list")
    public void iChooseValue(String value) {
        System.out.println();
        loginPage.chooseValueInDropdown(value);
        System.out.println();
    }
    @And("i click on SideBar icon {}")
    public void iClickOnSideBarIcon(EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName) {

        generalPosPage.clickSideIcon(enumSideBarsIconsAndButtonsName);

    }

    @And("I checked CashRegister if it is open then open register and if it is close then do nothing")
    public void iCheckedCashRegisterIfItSOpenThenOpenRegisterAndIfItSCloseThenDoNothing() {
        if (!loginPage.cashRegisterIsOpened()){
            loginPage.clickOnCloseOrOpenRegisterButton();
            System.out.println("Closed cash");
        } else {
            System.out.println("Opened cash");
        }
    }


    @And("I click on SideBar icon {}")
    public void iClickOnLOGOUTButtonOnSideBarMenu(EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName) {
        generalPosPage.clickSideIcon(enumSideBarsIconsAndButtonsName);
    }


    @And("I check if I can see {} field on Login Page")
    public void iCheckIfICanSeeLOGINButtonOnLoginPage(EnumLoginFields enumLoginFields) {
        loginPage.findElementOnLoginPage(enumLoginFields);
    }

    @And("I click on {} button on side bar")
    public void iClcikOnSynchronizeButtonOnSideBar(EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName) {
        generalPosPage.clickSideIcon(enumSideBarsIconsAndButtonsName);
    }

    @And("I check if SIDEBAR_MENU display")
    public void iCheckIfSIDEBAR_MENUDisplay() {
        generalPosPage.checkSideBarOnGeneralPogPageIsDisplayed();
    }
}