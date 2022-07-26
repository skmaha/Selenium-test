package selenium_test;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waits {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sunilk/chromedriver");
		WebDriver driver = new ChromeDriver();

    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
    driver.findElement(By.cssSelector("#btn2")).click();
//https://www.seleniumeasy.com/selenium-tutorials/waits-and-timeout-selenium-4
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("(//input[@id='txt2'])[1]")).sendKeys("This is Cool-2");
    Thread.sleep(5000);
    driver.quit();
    }
}
