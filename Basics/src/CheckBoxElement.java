import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxElement {
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
            option.click();
            System.out.println(option.isSelected());
            //1 second delay to see changes
            Thread.sleep(1000);
        }

        //Checking if the Return Date is enabled or not
        //System.out.println("The Return Date is enabled: " + driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

        //Clicking on Round Trip radio button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        //Checking if the Return Date is grayed out or not
        if(driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style").contains("opacity: 0.5;")){
            System.out.println("The Return Date element is Disabled");
        }
        else{
            System.out.println("The Return Date element is Enabled");
        }
    }
}
