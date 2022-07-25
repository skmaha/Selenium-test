package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sunilk/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus 10T");
		driver.findElement(By.cssSelector("#gh-btn")).click();
		js.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.cssSelector("input[aria-label='New']")).click();
		driver.findElement(By.cssSelector("input[name='location'][aria-label='Asia']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
