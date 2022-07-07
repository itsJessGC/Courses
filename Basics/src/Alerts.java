import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Add our name to the input slot
        driver.findElement(By.id("name")).sendKeys("Jess");
        //Click on Alert button
        driver.findElement(By.id("alertbtn")).click();
        //Timer to wait 2 seconds
        Thread.sleep(2000);
        //Print out the alert text
        System.out.println("The message in the alert is: " + driver.switchTo().alert().getText());
        //Click on OK that is on the alert
        driver.switchTo().alert().accept();
        //CLick on Confirm button
        driver.findElement(By.id("confirmbtn")).click();
        //Timer to wait 2 seconds
        Thread.sleep(2000);
        //Click on Cancel that is on the alert
        driver.switchTo().alert().dismiss();
    }
}
