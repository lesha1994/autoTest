package selenium.pages;

import org.openqa.selenium.By;

public class LoginPage    {

    private static final By ACCESS_CODE = By.xpath("//input[@id='companyId']");
    private static final By continueButton = By.xpath("//button[@* = 'btnSubmit']");
    private static final By InvalidAccess = By.xpath("//div[@id='snackbar']");
    private final By UserName = By.xpath("//input[@id='username']");
    private final By PassWord = By.xpath("//input[@id='password']");
    private final By LoginButton = By.xpath("//button[@value='login']");
    private final By Store = By.xpath("//div[@class = 'dropdown__header']");
    private final By SelectedStore = By.xpath("//li[text()='Ingenico Test Store (test)']");
    private final By CashRegister = By.xpath("//input[@placeholder='Enter cash register #, or name']");
    private final By ListOfLanguages = By.xpath("//div[@class = 'form-group']/div[@id = 'language']");
    private final By LanguageOfSystem = By.xpath("//li[text() = 'English']");
    private final By OkBtn = By.xpath("//button[@data-keypress='Enter']");



    public By fieldForAccessCode(){
       return ACCESS_CODE;
    }

    public By clickOnOkBtn(){
        return OkBtn;
    }

    public By clickOnLanguage(){
        return ListOfLanguages;
    }

    public By chooseLanguage(){
        return LanguageOfSystem;
    }

    public By putCashRegister(){
        return CashRegister;
    }

    public By clickContinueButton(){
        return continueButton;
    }

    public  By showInvalidAccess(){
        return InvalidAccess;
    }

    public By fieldUserName(){
        return UserName;
    }

    public By fieldPassWord(){
        return PassWord;
    }

    public By clickBtnLogin(){
        return LoginButton;
    }

    public final By clickOntStore(){
        return Store;
    }

    public final By selectStore(){
        return SelectedStore;
    }




}
