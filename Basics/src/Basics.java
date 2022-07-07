import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) {
        /*
            This line helps Selenium to identify where is the Driver that is going to be used.
            The first parameter indicates that it is a Chrome Driver, and the second one indicates
            the directory where it is located.
        */
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");

        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();

        //get -> Opens a browser with a URL
        driver.get("https://google.com");

        //returns the title of the webpage that is displaying
        System.out.println("Web Page Title: " + driver.getTitle());
        //returns the URL of the webpage that is displaying
        System.out.println("Web Page URL: " + driver.getCurrentUrl());
        //returns the source of the webpage that is displaying
        //System.out.println("Web Source: " + driver.getPageSource());
    }
}
