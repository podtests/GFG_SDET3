import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LoginTest {

    WebDriverWait wait;
    ChromeOptions chromeOptions;
    FirefoxOptions firefoxOptions;

    WebDriver wd;
    FluentWait fluentWait;

    @Parameters({"browser"})
    @BeforeClass(alwaysRun = true)
    public void BC(String browserName) throws MalformedURLException {
        System.out.println("Value of Browser is: "+ browserName);
        switch (browserName) {
            case "chrome": {
                chromeOptions = new ChromeOptions();
                wd = new RemoteWebDriver( new URL("http://localhost:4444/"), chromeOptions);
                break;
            }
            case "firefox": {
                firefoxOptions = new FirefoxOptions();
                wd = new RemoteWebDriver( new URL("http://localhost:4444/"), firefoxOptions);
                break;
            }
            default: {
                chromeOptions = new ChromeOptions();
                wd = new RemoteWebDriver( new URL("http://localhost:4444/"), chromeOptions);
                break;
            }
        }

    }

    @BeforeMethod(alwaysRun = true)
    public void preMethodsteps() throws MalformedURLException {

        wd.get("https://demo.evershop.io/account/login");

        fluentWait = new FluentWait(wd)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5));
    }

    @Test(groups = {"Sanity"})
    public void successLogin() throws MalformedURLException {
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));

        wd.findElement(By.name("email123")).sendKeys("Akhiljda@gmail.com");
        wd.findElement(By.name("password")).sendKeys("Password");
        wd.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Test
    public void unsuccessLogin() throws MalformedURLException {

        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));

        wd.findElement(By.name("email")).sendKeys("Akhiljda@gmail.com");
        wd.findElement(By.name("password")).sendKeys("Pas123sword");
        wd.findElement(By.xpath("//button[@type='submit']")).click();
    }




}
