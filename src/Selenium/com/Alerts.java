package Selenium.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement Simple_Alert=driver.findElement(By.id("alertButton"));
		Simple_Alert.click();
		Thread.sleep(2000);
		Alert Click=driver.switchTo().alert();
		Click.accept();
		
		/*
		WebElement Delay_Alert=driver.findElement(By.id("timerAlertButton"));
		 Delay_Alert.click();
		 Alert confirm =driver.switchTo().alert();
		 confirm.accept();
		 
		 
		
		WebElement Confirm_Alert=driver.findElement(By.id("confirmButton"));
		 Confirm_Alert.click();
		 Alert confirm1 =driver.switchTo().alert();
		 confirm1.dismiss();
		 
		 
		 WebElement Prompt_Alert=driver.findElement(By.id("promtButton"));
		 Prompt_Alert.click();
		 Alert Prompt =driver.switchTo().alert();
		 Prompt.sendKeys("Hello...");
		 Prompt.accept();
		 */
	}

}
