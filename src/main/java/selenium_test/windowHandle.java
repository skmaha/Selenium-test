package selenium_test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.java.forloop;

import io.netty.util.internal.ThreadExecutorMap;

public class windowHandle {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sunilk/chromedriver");
        singleWindow();
        //multiWindows();
        // singleTab();
        // multiTabs();
    }

    public static void singleWindow() throws InterruptedException {
        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");  

        String main_window = driver.getWindowHandle();
        System.out.println("Main Window is - " + main_window +   driver.getTitle());

        driver.findElement(By.cssSelector("#newWindowBtn")).click();

        Set<String> all_windows = driver.getWindowHandles();
        for (String ch_window : all_windows ){
            if (!ch_window.equals(main_window)){
                driver.switchTo().window(ch_window);
                Thread.sleep(2000);
                // System.out.println(ch_window +   driver.getTitle());
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sunil Kumar");
                driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Matangi");
                driver.findElement(By.id("femalerb")).click();
                driver.findElement(By.xpath("(//input[@id='frenchchbx'])[1]")).click();
                System.out.println("Child Tab title is -" + driver.getTitle());
                System.out.println("The child window is " + driver.getTitle() + "exiting");
                driver.close();
                Thread.sleep(2000);
            }
        // driver.switchTo().window(main_window);
            // Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("This is COOL STUFF");
            // // Thread.sleep(3000);
            // // System.out.println("The Main window is" + driver.getTitle() + "Exiting");
            // driver.quit();
        }
    }

    public static void multiWindows() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();


        
    }
}
