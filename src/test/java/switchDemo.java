import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

public class switchDemo {

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

    @BeforeMethod(alwaysRun = false)
    public void preMethodsteps() throws MalformedURLException {

        wd.get("https://selectorshub.com/iframe-scenario/");

        fluentWait = new FluentWait(wd)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5));
    }

    @Test(enabled = false)
    public void alertBox() throws InterruptedException {
        wd.findElement(By.xpath("//button[@class='alert']")).click();
        Thread.sleep(10000);

        System.out.println(wd.switchTo().alert().getText());
        wd.switchTo().alert().accept();
    }

    @Test(enabled = false)
    public void multipleTab() {
        String currentTabHandle = wd.getWindowHandle();
        System.out.println("Current: "+currentTabHandle);
        wd.findElement(By.xpath("//a[@id='Website-id']")).click();
        wd.findElement(By.xpath("//a[@id='LinkedIn-id']")).click();
        wd.findElement(By.xpath("//a[@id='Youtube']")).click();

        Set<String> handles= wd.getWindowHandles();

        for (String s1 : handles) {
            System.out.println(s1);
        }

        wd.switchTo().window(currentTabHandle);

        System.out.println(wd.getTitle());


    }

    @Test(enabled = false)
    public void iframeTest() {

        wd.switchTo().frame("pact1");
        wd.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("Akhil");
        wd.switchTo().frame("pact2");
        wd.findElement(By.xpath("//input[@id='jex']")).sendKeys("Jain");
        wd.switchTo().parentFrame();
        wd.switchTo().parentFrame();

    }

    @Test(groups = {"Action"})
    public void actionTest() {
        Actions a1 = new Actions(wd);
        //Keyboard : adding uppercase text

        wd.get("https://demo.evershop.io/account/login");
        WebElement el1 = wd.findElement(By.name("email"));

        a1.click(el1).keyDown(Keys.SHIFT).sendKeys("akhiljda@gmail.com").keyUp(Keys.SHIFT).perform();

        //selenium 3
        //a1.moveToElement(el1).contextClick().perform();

        //selenium 4
        a1.contextClick(el1).perform();




    }
}
