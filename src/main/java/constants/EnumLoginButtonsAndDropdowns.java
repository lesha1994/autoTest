package constants;

public enum EnumLoginButtonsAndDropdowns implements IForEnumButtonsValue {

    CONTINUE("btnSubmit"),
    LOGIN("login"),
    STORE("Store Name"),
    LANGUAGE("Language"),
    OK("Enter");


    private String buttonName;

    EnumLoginButtonsAndDropdowns(String buttonName) {
        this.buttonName = buttonName;
    }

    @Override
    public String toString() {
        return buttonName;
    }
}
