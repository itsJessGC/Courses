import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Click the dropdown
        driver.findElement(By.id("divpaxinfo")).click();
        //Timer to see the change
        Thread.sleep(1000);

        //Adding 5 more Adults to the flight
        for(int i=1; i<6; i++){
            //Click to add Adult
            driver.findElement(By.id("hrefIncAdt")).click();
            //Timer to see the change
            Thread.sleep(1000);
        }

        //Adding 3 Children to the flight
        int cont = 0;
        while(cont <3){
            //Click to add Child
            driver.findElement(By.id("hrefIncChd")).click();
            //Timer to see the change
            Thread.sleep(1000);
            //increment counter
            cont++;
        }

        //Click to add Infant
        driver.findElement(By.id("hrefIncInf")).click();
        //Timer to see the change
        Thread.sleep(1000);

        //Click Done
        driver.findElement(By.id("btnclosepaxoption")).click();
    }
}
