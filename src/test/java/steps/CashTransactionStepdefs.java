package steps;

import constants.*;
import io.cucumber.java.en.And;
import selenide.GeneralPosPage;
import selenide.TransactionFlowPage;
import selenide.TransactionListPage;

import static com.codeborne.selenide.Selenide.open;



public class CashTransactionStepdefs {

    GeneralPosPage generalPosPage = new GeneralPosPage();
    TransactionFlowPage transactionFlowPage = new TransactionFlowPage();

    @And("I click on {} button to find product")
    public void searchInputClicke(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
        generalPosPage.clickInputField(enumGeneralPageButtonsAndFields);
    }


    @And("I input in search field {} value {string}")
    public void iInputInSearchFieldProductIdValue(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields, String value) {
        generalPosPage.inputInField(enumGeneralPageButtonsAndFields, value);
    }

    @And("I click on {} that was found")
    public void iClickOnProductThatWasFound(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
        generalPosPage.clickOnProduct(enumGeneralPageButtonsAndFields);
    }

    @And("I click {} button in Cash Payment block")
    public void iClickEXACTButtonTo(EnumTransactionFlowButtons enumCashPaymentButton) {
        transactionFlowPage.clickOnButtonInCashPaymentDialog(enumCashPaymentButton);
    }

    @And("I click {} button on General Page")
    public void iClickButton(EnumGeneralPageButtonsAndFields enumLoginButtonsAndDropdowns) {
        System.out.println();
        generalPosPage.clickButtonByAttributeValueWithoutAttributeName(enumLoginButtonsAndDropdowns);
        System.out.println();
    }

    @And("I click {} button in Transaction Flow Page")
    public void iCLickButtonInTransactionFlowPage(EnumTransactionFlowButtons enumTransactionFlowButtons) {
        transactionFlowPage.clickButtonByAttributeValueWithoutAttributeName(enumTransactionFlowButtons);
    }


    @And("I processed new transaction without complete")
    public void iProcessedNewTransactionWithoutComplete() {
        generalPosPage.clickInputField(EnumGeneralPageButtonsAndFields.SEARCH_INPUT);
        generalPosPage.inputInField(EnumGeneralPageButtonsAndFields.SEARCH_INPUT, "2720");
        generalPosPage.clickOnProduct(EnumGeneralPageButtonsAndFields.PRODUCT);
        transactionFlowPage.clickOnButtonToConfirmOrder(EnumTransactionFlowButtons.MAKE_PAYMENT);
        transactionFlowPage.chooseCashPaymentType(EnumGeneralPageButtonsAndFields.CASH);
        transactionFlowPage.clickOnButtonInCashPaymentDialog(EnumTransactionFlowButtons.EXACT);
    }

    @And("I click button {} in Transaction Flow Page")
    public void iClickButtonInTranscationFlowPage(EnumTransactionFlowButtons enumTransactionFlowButton) {
        transactionFlowPage.clickOnButtonToConfirmOrder(enumTransactionFlowButton);
    }


    @And("I get transaction id on receipt page")
    public void iGetTransactionIdOnReceiptPage() {
        String id = transactionFlowPage.getIdOFCurrentTransaction();
        TestCache.putInTestCacheMap("idOfLastTransaction" + Thread.currentThread().getId(), id);
        System.out.println(id);
    }

    @And("I choose payment type {}")
    public void iChoosePaymentTypeCASH(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
        transactionFlowPage.chooseCashPaymentType(enumGeneralPageButtonsAndFields);
    }

    @And("I check that {} button is not display in Transaction Flow Page")
    public void iCheckThatCOMPLETE_TRANSACTIONButtonIsNotDisplayInTransactionFlowPage(EnumTransactionFlowButtons enumTransactionFlowButton) {
        transactionFlowPage.buttonIsNotDisplayed(enumTransactionFlowButton);
    }

}


