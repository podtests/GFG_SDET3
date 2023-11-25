import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumDemo {

    public static void main(String[] args) throws MalformedURLException {

        //Connect to chromedriver directly
        //WebDriver wd = new ChromeDriver();

        WebDriverWait wait;
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver wd = new RemoteWebDriver( new URL("http://localhost:4444/"), chromeOptions);

        wd.get("https://demo.evershop.io/account/login");

        //Implicit wait
        //wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Explicit wait:
       // wait = new WebDriverWait(wd,Duration.ofSeconds(30) );
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));


        //Fluent Wait
        FluentWait fluentWait = new FluentWait(wd)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5));

        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));

        //wd.findElement(By.xpath("//input[@name='email']")).sendKeys("Akhiljda@gmail.com");

        wd.findElement(By.name("email")).sendKeys("Akhiljda@gmail.com");

        //1 session = 1 Browser --> 1 tab
       // wd.quit(); //

        //WebElement e1 = wd.findElement(By.xpath("//input[@name='email']"));

        //e1.sendKeys("Akhil");


       // wd.get("https://podtest.in");
    }


}
