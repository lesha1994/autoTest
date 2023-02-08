package steps;

import constants.EnumPosSettingPage;
import constants.EnumSideBarsIconsAndButtonsName;
import io.cucumber.java.en.And;
import selenide.GeneralPosPage;
import selenide.PosSettingsPage;
import selenide.TimeClockPage;
import selenide.TransactionFlowPage;

public class RegressionFlowSterpdefs {
    GeneralPosPage generalPosPage = new GeneralPosPage();
    TransactionFlowPage transactionFlowPage = new TransactionFlowPage();
    PosSettingsPage posSettingsPage = new PosSettingsPage();



//    @And("I click on {} button in sidebar")
//    public void iClickOnButtonInSidebar(EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName) {
//        generalPosPage.clickSideIcon(enumSideBarsIconsAndButtonsName);
//    }

    @And("I click on {} button in Settings dropdowm")
    public void iClickOnDEVICESETTINGButton(EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName) {
        generalPosPage.clickSideIcon(enumSideBarsIconsAndButtonsName);
    }

    @And("I click on {} button")
    public void iClickOnADDDEVICEButton(EnumPosSettingPage enumPosSettingPage) {
        posSettingsPage.clickButtonOnSettingsPage(enumPosSettingPage);
    }

    @And("I click on {} on Device Type Screen")
    public void iClickOnTERMINALSOnDeviceTypeScreen(EnumPosSettingPage enumPosSettingPage) {
        posSettingsPage.clickButtonToChooseDeviceType(enumPosSettingPage);
    }

    @And("I click on {} terminal")
    public void iClickOnIngenicoISCTerminal(EnumPosSettingPage enumPosSettingPage) {
        posSettingsPage.clickOnParticularTerminal(enumPosSettingPage);
    }

    @And("I click on {} to use as Signature Capture")
    public void iClickOnTOGGLEToUseAsSignatureCapture(EnumPosSettingPage enumPosSettingPage) {
        posSettingsPage.clickOnToggle(enumPosSettingPage);
    }

    @And("I check that {} display")
    public void iCheckThatPOPUPDisplay() {
        posSettingsPage.checkIfPopUpIsDisplayed();
    }

    @And("I click on {} in front of Ingenico")
    public void iClickOnDOTSInFrontOfIngenicoISC(EnumPosSettingPage enumPosSettingPage) {
        posSettingsPage.clickOnDotsButton(enumPosSettingPage);
    }

    @And("I click on REMOVE DEVICE button in pop-up")
    public void iClickOnREMOVEDEVICEButtonInPopUp() {
    }
}
