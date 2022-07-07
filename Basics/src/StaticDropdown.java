import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Creating a Web Element where the dropdown is located
        WebElement staticDropdownWebElement = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        //Create a Select class and make it point to our dropdown
        Select staticDropdown = new Select(staticDropdownWebElement);
        //Select the USD option from the dropdown
        staticDropdown.selectByVisibleText("USD");
        //Pause execution for 2 seconds
        Thread.sleep(2000);
        //Select AED by index
        staticDropdown.selectByIndex(2);
    }
}
