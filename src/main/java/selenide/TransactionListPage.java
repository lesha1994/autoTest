package selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import constants.EnumTransactionList;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class TransactionListPage extends BasePage{

    //String XPATH_TO_FIRST_ELEMENTS_TRANSACTION_LIST =  "//div[@class='tableBody tableGrid']/div/div[2]/*[text()='%s']";
    String XPATH_TO_FIRST_ELEMENTS_TRANSACTION_LIST =  "//div/div[2]/*[text()='%s']";

    final String XPATH_TO_BUTTON_TRANSACTION_DETAILS = "//button[text() = '%s']"; //button/span[text() = '%s']



    public void clickOnIDInTransactionList(String id) {
        System.out.println("Id in method: " + id);
        String locator = String.format(XPATH_TO_FIRST_ELEMENTS_TRANSACTION_LIST, id);
        System.out.println(locator);
        Selenide.switchTo().frame("transactionsIframe");
        $x(locator).shouldHave(Condition.exist, Duration.ofSeconds(10)).click();
        Selenide.switchTo().defaultContent();
    }


    public void clickOnButtonTransactionDetailsByText(EnumTransactionList enumTransactionListButton){
        String locator = XPATH_TO_BUTTON_TRANSACTION_DETAILS;
        if (enumTransactionListButton == EnumTransactionList.CONTINUE_BUTTON) locator = locator.replace("button", "button/span");
        $x(String.format(locator, enumTransactionListButton.toString())).click();
    }


}
