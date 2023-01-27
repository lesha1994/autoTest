package steps;

import constants.EnumSideBarsIconsAndButtonsName;
import constants.EnumTransactionList;
import constants.TestCache;
import io.cucumber.java.en.And;
import org.assertj.core.api.Assertions;
import selenide.GeneralPosPage;
import selenide.TransactionListPage;

public class VoidTransactionStepdefs {

    GeneralPosPage generalPosPage = new GeneralPosPage();
    TransactionListPage transactionListPage = new TransactionListPage();


    @And("I click on {} button in sidebar")
    public void iClickOnTransactionButtonInSidebar(EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName) {
        generalPosPage.clickSideIcon(enumSideBarsIconsAndButtonsName);
    }



    @And("I get last transaction id before")
    public void iGetLastTransactionIdBefore() {
        //String lastId= new TransactionListPage().getLastId();
       // TestCache.putInTestCacheMap("lastIdBefore" + Thread.currentThread().getId(), lastId);
    }


    @And("I check that transaction was successful")
    public void iCheckThatTransactionWasSuccessful() {
        String lastIdBefore = (String) TestCache.getFromTestCacheMap("lastIdBefore" + Thread.currentThread().getId());
        String lastIdAfter = (String) TestCache.getFromTestCacheMap("lastIdAfter" + Thread.currentThread().getId());
        Assertions.assertThat(lastIdBefore).isNotEqualTo(lastIdAfter);
    }

    @And("I click on line by id from last transaction")
    public void iClickOnLineByIdFromLastTransaction() {
        String id = (String) TestCache.getFromTestCacheMap("idOfLastTransaction" + Thread.currentThread().getId());
        System.out.println(id);
        transactionListPage.clickOnIDInTransactionList(id);
    }

    @And("I click on {} button on transaction details screen")
    public void iClickOnVOIDButtonOnTransactionDetailsScreen(EnumTransactionList enumTransactionList) {
        transactionListPage.clickOnButtonTransactionDetailsByText(enumTransactionList);
    }

}
