package selenium_test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

    public static void main(String[] args) throws InterruptedException {
        //explicitWait();
        implicitlyWait();
    }
    
    // best explanation by pramod https://www.youtube.com/watch?v=upDhIhDezxQ
    public static void explicitWait() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sunilk/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/ncr");
        driver.findElement(By.xpath("//*[@id='L2AGLb']")).click(); // to accept the cookies "Accept all" button click
        //driver.findElement(By.xpath("input[title='Search']")).sendKeys("Cheese" + Keys.ENTER);
        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(30))
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(firstResult.getText());
        driver.quit();
    }

    //https://www.seleniumeasy.com/selenium-tutorials/waits-and-timeout-selenium-4
    public static void implicitlyWait() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sunilk/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.cssSelector("#btn2")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement content = driver.findElement(By.xpath("(//input[@id='txt2'])[1]"));
        content.sendKeys("This is Cool-2");
        System.out.println("content is : "+content.getAttribute("value"));
        Thread.sleep(5000);
        driver.quit();
    }

}