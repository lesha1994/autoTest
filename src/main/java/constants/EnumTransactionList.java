package constants;

public enum EnumTransactionList {

    TRANSACTION_ID(""),
    VOID_BUTTON("Void"),
    CONTINUE_BUTTON("Continue"),

    ;





    private String text;

    EnumTransactionList(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public String getValue() {
        return text;
    }
}

