package constants;


public enum EnumLoginFields implements IForEnumInputFields {
    USERNAME("username"),
    PASSWORD("password"),
    ACCESS_CODE("companyId"),
    REGISTER("license_key");




    private String text;

    EnumLoginFields(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
