import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Screenshots {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Maximize Window
        driver.manage().window().maximize();
        //Open browser with URL
        driver.get("https://amazon.com/");
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Enter PlayStation in the search bar and press ENTER
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("PlayStation", Keys.ENTER);

        //Create JavaScript Executor
        JavascriptExecutor jsExe = (JavascriptExecutor) driver;

        //take a screenshot
        newScreenshot(driver);
    }

    public static String getDate(){
        //indicate what format we want the date to be in
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSS");
        //Get the current exact date
        LocalDateTime currentDate = LocalDateTime.now();
        //Save it as the wanted format
        String date = formatDate.format(currentDate);

        return date;
    }

    public static void newScreenshot(WebDriver driver) throws IOException {
        //Create Variable to save Screenshots as a File
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //Save screenshot to assets folder with the name screenshot.png
        FileUtils.copyFile(srcFile, new File("assets\\" + getDate() + ".png"));
    }

}
