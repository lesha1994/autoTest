package pages;

import org.openqa.selenium.By;

public class CardPage {

    private final By SearchInput = By.xpath("//input[@class = 'search__input']");
    private final By Product = By.xpath("//div[text()='Apple iPhone 6/6s B-Tact Case, Teal & Dark Green']");
    private final By MakePayment = By.xpath("//button[@id='cart-cash-button']");
    private final By Cash = By.xpath("//div[@class='payment-item-inner']");
    private final By Exact = By.xpath("(//button[@class = 'main-keyboard__shortcuts-button '])[1]");
    private final By Complete = By.xpath("//button[@class = 'btn btn-primary btn-adaptive btn-double-size']");

    public By pressComplete(){
        return Complete;
    }

    public By pressExact(){
        return Exact;
    }

    public By chooseCash(){
        return Cash;
    }



    public By buttonMakePayment(){
        return MakePayment;
    }
    public By fieldSearchInput(){
        return SearchInput;
    }

    public By testProduct(){
        return Product;
    }


}


