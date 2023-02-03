package constants;

public enum EnumSideBarsIconsAndButtonsName {
    CART("cart"),
    TRANSACTIONS("bag"),
    MANUAL_REFUND(""),
    REGISTER_OPERATIONS("icon-cash-register"),
    SETTINGS("settings"),
    SYNCHRONIZE("synchronization"),
    ADDITIONAL_INFO("info"),
    TIME_CLOCK("clock"),
    LOGOUT("logout"),
    SIDEBAR_MENU("menu__container"),
    DEVICE_SETTINGS("2"),
    OPEN_OR_CLOSE_REGISTER("1");
    ;






    private String text;

    EnumSideBarsIconsAndButtonsName(String text) {
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
