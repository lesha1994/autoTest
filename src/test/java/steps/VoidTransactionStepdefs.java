package steps;

import constants.EnumSideBarsIconsAndButtonsName;
import constants.EnumTransactionList;
import constants.EnumTransactionStatusAndType;
import constants.TestCache;
import io.cucumber.java.en.And;
import org.assertj.core.api.Assertions;
import selenide.GeneralPosPage;
import selenide.TransactionListPage;

public class VoidTransactionStepdefs {

    GeneralPosPage generalPosPage = new GeneralPosPage();
    TransactionListPage transactionListPage = new TransactionListPage();






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

    @And("I click on checkbox {}")
    public void iClickOnCheckboxGENERAL_CHECK_BOX(EnumTransactionList enumTransactionList) {
        transactionListPage.clickOnCheckBoxButtonTransactionDetails(enumTransactionList);
    }

    @And("I check that line with id from last transaction has type {}")
    public void iCheckThatLineWithIdFromLastTransactionHasTypeEXCHANGE(EnumTransactionStatusAndType enumTransactionStatusAndType) {
        System.out.println("needed type: " + enumTransactionStatusAndType);
        String id = (String) TestCache.getFromTestCacheMap("idOfLastTransaction" + Thread.currentThread().getId());
        id = String.valueOf(Integer.parseInt(id) + 1);
        String type = transactionListPage.getTypeOfTransactionById(id);
        System.out.println("received type: " + type);
        Assertions.assertThat(type.toUpperCase()).isEqualTo(enumTransactionStatusAndType.toString().toUpperCase());
    }
}
