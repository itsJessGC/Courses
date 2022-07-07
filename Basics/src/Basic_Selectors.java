import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://facebook.com");

        //Find the email element by ID
        driver.findElement(By.id("email")).sendKeys("randomEmail@email.com");
        //Find the password element by name
        driver.findElement(By.name("pass")).sendKeys("safePass");
        //Find the link element by its text
        driver.findElement(By.linkText("Forgot password?")).click();
        //Find the link element by a part of its text
        //driver.findElement(By.partialLinkText("password")).click();
    }
}
