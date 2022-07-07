import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Click input to start Suggestive Dropdown
        driver.findElement(By.xpath("//input[@id='autosuggest']")).click();
        //Typing rus in the input bar
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("rus");
        //Delay for the suggestions to appear
        Thread.sleep(2000);
        //Saving all of the suggestions in a List of WebElements
        List<WebElement> dropdown_suggestions = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

        //Printing the List of Suggestions that show up when we type rus in the input bar
        for(WebElement suggestion:dropdown_suggestions){
            System.out.println(suggestion.getText());
            //If the current Element is Russian Federation then click
            if (suggestion.getText().equals("Russian Federation")){
                suggestion.click();
                break;
            }
        }
    }
}
