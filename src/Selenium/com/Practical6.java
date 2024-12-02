package Selenium.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practical6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alert1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button"));
		alert1.click();
		Alert ok1 =driver.switchTo().alert();
		ok1.accept();
		System.out.println(" 1st Box Clicked with alert");
		
		WebElement alert2 = driver.findElement(By.linkText("Alert with OK & Cancel"));
		alert2.click();
		//Alert okk =driver.switchTo().alert();
		//okk.accept();
		System.out.println(" 2nd Box Clicked ");
		
		WebElement conform_box_alert= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
		conform_box_alert.click();
		Alert conform= driver.switchTo().alert();
		conform.accept();
		System.out.println(" 2nd Box Deny with alert");
		
		WebElement alert3 = driver.findElement(By.linkText("Alert with Textbox"));
		alert3.click();
		System.out.println(" 3rd Box clicked ");
		/*
		WebElement clickbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
		clickbox.click();
		Alert allow=driver.switchTo().alert();
		allow.sendKeys("finally last Alert");
		allow.accept();
		System.out.println(" 3rd Box clicked with alert ");
		*/
		WebElement clickbox = driver.findElement(By.xpath("//button[contains(@onclick,'promptbox()')]"));
		clickbox.click();
		Alert allow=driver.switchTo().alert();
		allow.sendKeys("finally last Alert"); 
		allow.accept();
		System.out.println(" 3rd Box clicked with alert ");
		
		
	}

}
