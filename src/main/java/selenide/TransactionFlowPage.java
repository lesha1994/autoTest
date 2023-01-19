package selenide;

import com.codeborne.selenide.Condition;
import constants.EnumGeneralPageButtonsAndFields;
import constants.IForEnumButtonsValue;

import static com.codeborne.selenide.Selenide.$x;

public class TransactionFlowPage extends BasePage {

   private static final  String  XPATH_TO_ID_OF_TARNSACTION = "//h2[@class]";

   public String getIdOFCurrentTransaction() {
       return $x(XPATH_TO_ID_OF_TARNSACTION).shouldHave(Condition.matchText("Receipt")).getText().replace("Receipt #", ""); //Receipt #64365
   }


   public void chooseCashPaymentType(EnumGeneralPageButtonsAndFields enumGeneralPageButtonsAndFields) {
       $x(String.format( "//button [@* ='payment-item']//div[text()='%s']", enumGeneralPageButtonsAndFields.toString())).click();
   }

}
