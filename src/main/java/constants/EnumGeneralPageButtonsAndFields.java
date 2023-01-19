package constants;

public enum EnumGeneralPageButtonsAndFields implements IForEnumInputFields, IForEnumButtonsValue {
    SEARCH_INPUT("fat-search-products"),
    MAKE_PAYMENT("cart-cash-button"),
    PRODUCT("Apple iPhone 6/6s B-Tact Case, Teal & Dark Green"),
    CASH("Cash"),
    EXACT("1"),
    COMPLETE_TRANSACTION("btn btn-primary btn-adaptive btn-double-size")
    ;



    private final String buttonName;

    EnumGeneralPageButtonsAndFields(String buttonName) {
        this.buttonName = buttonName;

    }



    @Override
    public String toString() {
        return buttonName;
    }
}
