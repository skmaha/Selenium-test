package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sunilk/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("HP")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Computers & Electronics Service Plans")).click();
		driver.navigate().to(("https://nb-no.facebook.com/"));
				

	}

}
