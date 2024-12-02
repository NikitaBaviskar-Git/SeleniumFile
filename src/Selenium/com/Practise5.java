package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");

		WebElement username =driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		username.sendKeys("Admin");
		System.out.println("Username Sent Successfully");
		
		WebElement password =driver.findElement(By.xpath("//input[(@name='password')]"));
		password.sendKeys("Admin123");
		System.out.println("Password Sent Successfully");
		
		WebElement login =driver.findElement(By.xpath("//input[contains(@value,'Log In')]"));
		login.click();
	}
}
