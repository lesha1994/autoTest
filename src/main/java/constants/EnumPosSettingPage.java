package constants;

public enum EnumPosSettingPage {

    ADD_DEVICE("add_device"),
    BURGER("plus_btn"),
    TERMINALS ("Terminals"),
    CASH_DRAWERS ("Cash Drawers"),
    PRINTERS("Printers"),
    INGENICO_iSC250 ("Ingenico iSC250"),
    TOGGLE("MuiFormGroup-root jss1"),
    ADD_DEVICE_ON_TERMINAL_PAGE("btn primary double_size"),
    POP_UP("modal done"),
    DONE("button blue primary s-2071787001"),
    DOTS_BUTTON("actionsDots"),



    ;





    private String text;

    EnumPosSettingPage(String text) {
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
