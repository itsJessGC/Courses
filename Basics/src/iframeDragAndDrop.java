import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class iframeDragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Maximize Window
        driver.manage().window().maximize();
        //Open browser with URL
        driver.get("https://jqueryui.com/droppable/");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Switch to the Drag and Drop iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        //Create an Actions variable for the mouse
        Actions variableAction = new Actions(driver);
        //Source Web Element
        WebElement source = driver.findElement(By.id("draggable"));
        //Target Web Element
        WebElement target = driver.findElement(By.id("droppable"));
        //Drag Source to Target
        variableAction.dragAndDrop(source, target).build().perform();

        //Switch back to the main iframe
        driver.switchTo().defaultContent();
    }
}
