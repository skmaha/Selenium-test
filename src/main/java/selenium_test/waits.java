package selenium_test;

import java.sql.Driver;
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
   // Thread.sleep(4000);
    //driver.quit();
    }
}
