package selenium_test;

import java.time.Duration;
import java.util.Set;
import javax.print.event.PrintEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.java.forloop;

import io.netty.util.internal.ThreadExecutorMap;

public class windowHandle {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sunilk/chromedriver");
        singleWindow();
        // multiWindows();
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

        driver.findElement(By.cssSelector("#newWindowsBtn")).click();

        Set<String> all_windows = driver.getWindowHandles();
        for (String ch_window : all_windows ){
            if (!ch_window.equals(main_window))
                // driver.getCurrentUrl();
                driver.switchTo().window(ch_window);
                Thread.sleep(2000);
                System.out.println(ch_window +   driver.getTitle());
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
    
    public static void multiWindows() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qed42.com/");
        String originalWindow = driver.getWindowHandle();
        System.out.println("Original Window Page is " + originalWindow + driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("//*[@id='L2AGLb']/div")).click();
        System.out.println("New window page is " + driver.getTitle());
        WebElement text = driver.findElement(By.xpath("//input[@title='Search']"));
        text.sendKeys("cheese");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
        String result = driver.findElement(By.xpath("//h3[normalize-space()='Cheese - Wikipedia']")).getText();
        System.out.println("First Result of the search is " + result);
        driver.close();
        for(String windowHandle : driver.getWindowHandles()){
            if(originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(originalWindow);
                driver.findElement(By.xpath("//*[@id='block-mainmenu-4']/ul/li[5]/a")).click();
                driver.findElement(By.xpath("//*[@id='section_8349']/div[2]/div[2]/a")).click();
                Thread.sleep(3000);
                break;
            }
        }
        driver.quit();
    }
}
