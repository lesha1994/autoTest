package tests;

import actions.MainPageActions;
import org.testng.annotations.Test;

public class CommonTest extends Base{

    @Test
    public void testData () throws InterruptedException {
        MainPageActions mainPageActions = new MainPageActions(driver);
        mainPageActions.fillAccessCode("9905400");
        mainPageActions.clickContinueButton();
        mainPageActions.userNameField("testadmin");
        mainPageActions.passWordField("Test123456");
        mainPageActions.LoginButton();
        mainPageActions.checkTitle();
        mainPageActions.clickStoreDropDown();
        mainPageActions.selectStore();
        mainPageActions.enterCashRegister();
        mainPageActions.clickOnDropDownLanguage();
        mainPageActions.chooseLanguageOfSystem();
        mainPageActions.clickOK();
        mainPageActions.clickOnSearchInput();
        mainPageActions.fillSearchInput();
        mainPageActions.chooseTestProduct();
        mainPageActions.clickMakePayment();
        mainPageActions.clickCashBtn();
        mainPageActions.clickExactBtn();
        mainPageActions.clickCompleteBtn2();
    }






}
