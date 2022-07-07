import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeSynchronization {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();

        //Creating an Implicit Wait to every Web Element
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

        //Click ADD TO CART from a Cucumber
        driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/following-sibling::div[@class='product-action']//button")).click();

        //Click on Cart to look at the items
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();

        //Click on PROCEED TO CHECKOUT button
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        //Enter promo code
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");

        //Click on Apply
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

        //Create our Explicit Wait driver
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));

        //Print out Applied message
        System.out.println("Message: " + driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
    }
}
