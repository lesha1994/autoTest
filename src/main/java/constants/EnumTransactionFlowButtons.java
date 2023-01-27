package constants;

public enum EnumTransactionFlowButtons implements IForEnumButtonsValue {
    EXACT("1"),
    CASH_EXCHANGE("CASH EXCHANGE"),
    MAKE_PAYMENT("Make Payment"),
    ISSUE_REFUND("Issue Refund"),
    CASH_RETURN("Cash Return"),
    MAKE_EXCHANGE("Make Exchange"),
    COMPLETE_TRANSACTION("Complete Transaction"),

    ;
    private final String buttonName;

    EnumTransactionFlowButtons(String buttonName) {
        this.buttonName = buttonName;

    }



    @Override
    public String toString() {
        return buttonName;
    }
}
