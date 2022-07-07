import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://www.amazon.com/");
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Create an Actions variable for the mouse
        Actions variableAction = new Actions(driver);

        //Web Element to send to Actions method
        WebElement elementForActions = driver.findElement(By.id("nav-link-accountList"));
        //Move mouse over the dropdown button
        variableAction.moveToElement(elementForActions).build().perform();

        //Search bar Web Element
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        //Click on Search bar
        variableAction.click(searchBar).build().perform();;
        //Type PlayStation in the search bar
        variableAction.sendKeys(searchBar,"PlayStation").build().perform();
    }
}
