package pages;

import io.opentelemetry.api.internal.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static tests.Base.getDriver;

public  class BasePage {
    WebDriver driver ;

    public BasePage(WebDriver driver) {
        this.driver = getDriver();

    }

    WebElement find (By locator){
        return driver.findElement(locator);
    }


    public void sendKeys(By locator, String text){

        find(locator).sendKeys(text);
    }

    public String getText(By locator){

        return  find(locator).getText();
    }

    public String getValue(By locator){


        return find(locator).getAttribute("value");

    }

    public void clickButton (By locator){

         find(locator).click();
    }

    public String getTitle(){

        return driver.getTitle();

    }



}
