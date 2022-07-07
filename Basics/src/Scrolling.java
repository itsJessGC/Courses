import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Maximize Window
        driver.manage().window().maximize();
        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Creating an executor for JavaScript
        JavascriptExecutor jsExe = (JavascriptExecutor) driver;
        //Execute JS to scroll 600 pixels down
        jsExe.executeScript("window.scrollBy(0,600)");
        Thread.sleep(1000);
        //Execute JS to scroll 600 pixels down
        jsExe.executeScript("window.scrollBy(0,600)");
        Thread.sleep(1000);
        //Find the table and scrol 50 pixels down
        jsExe.executeScript("document.querySelector('.tableFixHead').scrollTop=50");
    }
}
