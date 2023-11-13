package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void inicializaDriver(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void waitElementBeClickable(WebElement element){
        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(2)));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
