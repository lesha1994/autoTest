package actions;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CardPage;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class MainPageActions extends BasePage {

    LoginPage loginPage = new LoginPage();

    CardPage CardPage = new CardPage();

    public MainPageActions(WebDriver driver) {
        super(driver);
    }

    public void fillAccessCode(String text)  {

        sendKeys(loginPage.fieldForAccessCode(),text);
        String actualResult = getValue(loginPage.fieldForAccessCode());

        assertEquals("9905400", actualResult);

        System.out.println("Actual result for accessCode: " + actualResult);

        System.out.println("Expected result: 9905400");
    }

    public void clickContinueButton(){

        clickButton(loginPage.clickContinueButton());

    }

    public void userNameField(String text){
        sendKeys(loginPage.fieldUserName(),text);
        String actualResult = getValue(loginPage.fieldUserName());
        assertEquals("testadmin",actualResult);

        System.out.println();

        System.out.println("Actual result for login: " + actualResult);
        System.out.println("Expected result: testadmin ");

    }

    public void passWordField(String text){
        sendKeys(loginPage.fieldPassWord(),text);

        String actualResult = getValue(loginPage.fieldPassWord());

        System.out.println();

        System.out.println("Actual result for passWord : " + actualResult);
        System.out.println("Expected result: Test123456");

    }

    public void LoginButton(){
        clickButton(loginPage.clickBtnLogin());

    }


    public void clickStoreDropDown(){
        clickButton(loginPage.clickOntStore());
    }

    public void checkTitle() throws InterruptedException {

        Thread.sleep(2500);

        String actualTitle = getTitle();
        String expectedTitle = "Wireless POS";
        assertEquals(expectedTitle,actualTitle);


        System.out.println("Expexted result: " + expectedTitle);
        System.out.println("Actual result :" + actualTitle);
    }

    public void selectStore(){
        clickButton(loginPage.selectStore());
    }

    public void enterCashRegister(){
        sendKeys(loginPage.putCashRegister(),"1");

    }

    public void clickOnDropDownLanguage(){
        clickButton(loginPage.clickOnLanguage());
    }

    public void chooseLanguageOfSystem(){
        clickButton(loginPage.chooseLanguage());
    }

    public void clickOK()  {
        clickButton(loginPage.clickOnOkBtn());

    }

    public void clickOnSearchInput() throws InterruptedException{
        Thread.sleep(5000);
        clickButton(CardPage.fieldSearchInput());
    }

    public void fillSearchInput(){
        sendKeys(CardPage.fieldSearchInput(),"2720");
    }

    public void chooseTestProduct(){
        clickButton(CardPage.testProduct());
    }

    public void clickMakePayment(){
        clickButton(CardPage.buttonMakePayment());
    }

    public void clickCashBtn(){
        clickButton(CardPage.chooseCash());
    }

    public void clickExactBtn(){
        clickButton(CardPage.pressExact());

    }

    public void clickCompleteBtn2(){
        clickButton(CardPage.pressComplete());
    }






}
