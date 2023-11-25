import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class ElementDemoTest {


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

        wd.get("https://selectorshub.com/xpath-practice-page/");

        fluentWait = new FluentWait(wd)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5));
    }

    @Test
    public void dropdownTCSelect() {


       //Seelect
        /*
        WebElement el1 = wd.findElement(By.cssSelector("select[name=cars]"));
        Select s1 = new Select(el1);
        s1.selectByValue("saab");
        s1.selectByIndex(1);
*/

        //FindElements
        List<WebElement> options =   wd.findElements(By.cssSelector("select[name=cars] option"));

        Iterator<WebElement> i1 = options.iterator();

        String ddValue = "saab";
        WebElement e2 = null;
        while(i1.hasNext()) {
            e2 = i1.next();
            if (e2.getAttribute("value").equals(ddValue)) {
                e2.click();
            }

        }

    }
}
