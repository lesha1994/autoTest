package selenide;

import com.codeborne.selenide.Condition;
import constants.EnumGeneralPageButtonsAndFields;
import constants.EnumTransactionFlowButtons;
import constants.IForEnumButtonsValue;

import java.time.Duration;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$x;

public class TransactionFlowPage extends BasePage {

   private static final  String  XPATH_TO_ID_OF_TARNSACTION = "//h2[@class]";

   public String getIdOFCurrentTransaction() {
       return $x(XPATH_TO_ID_OF_TARNSACTION).shouldHave(Condition.matchText("Receipt")).getText().replace("Receipt #", ""); //Receipt #64365
   }


   public void clickOnButtonToConfirmOrder(EnumTransactionFlowButtons enumTransactionFlowButton) {
       $x(String.format("//button[@id='cart-cash-button']/span[text()='%s']", enumTransactionFlowButton.toString())).click();
   }

    public void clickOnButtonInCashPaymentDialog(EnumTransactionFlowButtons enumTransactionFlowButtons) {
        $x(String.format("(//div[@class = 'main-keyboard__item'])[%s]", enumTransactionFlowButtons.toString())).click();
    }

    public void chooseCashPaymentType(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
        $x(String.format( "//button [@* ='payment-item']//div[text()='%s']", enumGeneralPageButtonsAndFields.toString())).click();
    }

    public void buttonIsNotDisplayed(EnumTransactionFlowButtons enumTransactionFlowButton) {
       $x(String.format(XPATH_TO_BUTTON_BY_VALUE, enumTransactionFlowButton.toString())).shouldBe(Condition.disappear, Duration.ofSeconds(3));
    }
}
