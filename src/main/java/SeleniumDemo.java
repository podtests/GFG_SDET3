import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDemo {

    public static void main(String[] args) throws MalformedURLException {

        //Connect to chromedriver directly
        //WebDriver wd = new ChromeDriver();


        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver wd = new RemoteWebDriver( new URL("http://localhost:4444/"), chromeOptions);

        wd.get("https://demo.evershop.io/account/login");


        //wd.findElement(By.xpath("//input[@name='email']")).sendKeys("Akhiljda@gmail.com");

        wd.findElement(By.name("email")).sendKeys("Akhiljda@gmail.com");

        //1 session = 1 Browser --> 1 tab
        wd.quit(); //

        //WebElement e1 = wd.findElement(By.xpath("//input[@name='email']"));

        //e1.sendKeys("Akhil");


       // wd.get("https://podtest.in");
    }


}
