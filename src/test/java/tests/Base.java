package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.time.Duration;

public  class Base  {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        return driver;

    }

    @BeforeClass
    public void setup(){
        File file = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://qa-pos.b2bsoft.com/");

    }




    //@AfterClass
    //public void finish(){
      //  driver.quit();
    //}

}
