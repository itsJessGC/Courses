import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling_Parent {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/");

        //Find a text in the webpage
        System.out.println("The text that we are looking for is: " + driver.findElement(By.xpath("//*[text()='World class Tutorials on Selenium, Rest Assured, Protractor, SoapUI, Appium, Cypress, Jmeter, Cucumber, Jira ']")).getText());

    }
}
