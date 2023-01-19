package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//import static tests.Base.getDriver;

public  class BasePage {
    protected WebDriver driver;

    protected BasePage(WebDriver driver) {
        //this.driver = Base.getDriver();

    }

    protected WebElement find(By locator) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver.findElement(locator);
    }


    protected void sendKeys(By locator, String text){

        find(locator).sendKeys(text);
    }

    protected String getText(By locator){

        return  find(locator).getText();
    }

    protected String getValue(By locator){


        return find(locator).getAttribute("value");

    }

    protected void clickButton (By locator){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         find(locator).click();
    }

    protected String getTitle(){

        return driver.getTitle();

    }
}
