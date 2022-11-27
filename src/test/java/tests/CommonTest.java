package tests;

import actions.MainPageActions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonTest extends Base{


    @BeforeTest
    public void signIn(){
        MainPageActions mainPageActions = new MainPageActions(driver);
        mainPageActions.fillAccessCode("9905400");
        mainPageActions.clickContinueButton();
        mainPageActions.userNameField("testadmin");
        mainPageActions.passWordField("Test123456");
        mainPageActions.LoginButton();
    }

    @Test(priority=1)
    public void selectStoreAndChooseLanguageTest() throws InterruptedException {
        MainPageActions mainPageActions = new MainPageActions(driver);
        mainPageActions.checkTitle();
        mainPageActions.clickStoreDropDown();
        mainPageActions.selectStore();
        mainPageActions.enterCashRegister();
        mainPageActions.clickOnDropDownLanguage();
        mainPageActions.chooseLanguageOfSystem();
        mainPageActions.clickOK();
    }

    @Test(priority=2)
    public void cashTransactionTest() throws InterruptedException {
        MainPageActions mainPageActions = new MainPageActions(driver);
        mainPageActions.clickOnSearchInput();
        mainPageActions.fillSearchInput();
        mainPageActions.chooseTestProduct();
        mainPageActions.clickMakePayment();
        mainPageActions.clickCashBtn();
        mainPageActions.clickExactBtn();
        mainPageActions.clickCompleteBtn2();
    }
}
