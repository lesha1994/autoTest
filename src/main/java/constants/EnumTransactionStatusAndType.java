package constants;

public enum EnumTransactionStatusAndType {

    EXCHANGE("Exchange");



    private String text;

    EnumTransactionStatusAndType(String text) {
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
