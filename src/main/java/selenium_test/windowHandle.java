package selenium_test;

import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class windowHandle {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sunilk/chromedriver");
        singleWindow();
        //multiWindows();
        // singleTab();
        // multiTabs();
    }

    public static void singleWindow() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.hdfcbank.com/");
        driver.findElement(By.xpath("//button[@class='btn btn-primary login-btn hide-in-mobileApp ng-scope']")).click();   
        driver.findElement(By.xpath("(//a[@class='btn-primary login-url'][normalize-space()='Login'])[1]")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id='pageBody']/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("sunilmatangi");

        
    }

    public static void multiWindows() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();


        
    }
}
