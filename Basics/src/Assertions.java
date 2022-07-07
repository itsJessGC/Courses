import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Assertions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Storing Checkbox element in a list
        List<WebElement> checkbox_option = driver.findElements(By.xpath("//div[@id='discount-checkbox']//input[@type='checkbox']"));
        //Going through each checkbox in the list
        for(WebElement option:checkbox_option){
            System.out.println("Before selecting the element... Selected: " + option.getAttribute("id") + " " + option.isSelected());
            //Validate that the checkbox is NOT selected
            Assert.assertFalse(option.isSelected());
            option.click();
            //Validate that the checkbox IS selected
            Assert.assertTrue(option.isSelected());
            System.out.println(option.isSelected());
            //1 second delay to see changes
            Thread.sleep(1000);
        }
    }
}
