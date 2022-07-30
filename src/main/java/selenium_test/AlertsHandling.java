package selenium_test;

import java.time.Duration;

import javax.swing.text.AbstractDocument.Content;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHandling {
   public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "/Users/sunilk/geckodriver");
    // promt_alert();
    confirm_alert();
    // single_alert();
}

private static void promt_alert() throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
    driver.findElement(By.linkText("See a sample prompt")).click();
    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    alert.sendKeys("Data is been sent by Sunil");
    String popup_text = driver.switchTo().alert().getText();
    System.out.println("Promt_Message is: " + popup_text);
    Thread.sleep(3000);
    driver.switchTo().alert().accept();
    driver.quit();
}

private static void confirm_alert() throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
    driver.findElement(By.linkText("See a sample confirm")).click();
    Thread.sleep(3000);
    String popup_text = driver.switchTo().alert().getText();
    System.out.println("Alert_Message is: " + popup_text);
    driver.switchTo().alert().accept();
    driver.quit();
}

private static void single_alert() throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
    driver.findElement(By.linkText("See an example alert")).click();
    Thread.sleep(3000);
    // get alert text displayed on the console/terminal    
    String popup_text = driver.switchTo().alert().getText();
    System.out.println("Pupup_Text is: " + popup_text);
    // Alert accept/dismiss
    driver.switchTo().alert().accept();
    driver.quit();
}
}