import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Selectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        //Create a new Driver for Chrome
        WebDriver driver = new ChromeDriver();
        //Open browser with URL
        driver.get("https://facebook.com");

        //Find the email element by XPath that the browser gives you
        //driver.findElement(By.xpath("//*[@id='email']")).sendKeys("randomEmail@email.com");
        //Find the email element by XPath that we analyzed
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("randomEmail@email.com");

        //Find the password element by CSS
        //driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("safePass");
        //driver.findElement(By.cssSelector("input#pass")).sendKeys("safePass");
        //driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("safePass");
        //driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("safePass");

        //Find password element by XPath tested in console
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("safePassword");

        //Geting text
        System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso']")).getText());

        //Find button by XPath tested in console
        //driver.findElement(By.xpath("//a[contains(@id, 'u_0_2_')]")).click();
        //Find button by CSS tested in console
        driver.findElement(By.cssSelector("a[id*='u_0_2_']")).click();
    }
}
