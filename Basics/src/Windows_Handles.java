import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windows_Handles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Maximize Window
        driver.manage().window().maximize();
        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Click on "Free Access to InterviewQues/ResumeAssistance/Material" link
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

        //Save all new tabs/windows id's in a Set of Strings
        Set<String> newWindows = driver.getWindowHandles();
        //Create an Iterator to move along the Set
        Iterator<String> iterate = newWindows.iterator();
        //Variable for Main Web Page
        String mainPage = iterate.next();
        //Variable for Second Web Page
        String secondPage = iterate.next();

        //Switch to Second Web Page
        driver.switchTo().window(secondPage);
        //Save email to variable
        String email = driver.findElement(By.xpath("//a[@href='mailto:mentor@rahulshettyacademy.com']")).getText();

        //Switch to main Web Page
        driver.switchTo().window(mainPage);
        //Insert email to input
        driver.findElement(By.id("username")).sendKeys(email);
    }
}
