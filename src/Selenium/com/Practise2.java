package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/login");
		
		WebElement EmailAddressBox = driver.findElement(By.cssSelector("input[id ='email']"));
		EmailAddressBox.sendKeys("ABCHSK");
		
		WebElement PasswordBox = driver.findElement(By.cssSelector("input[id='password']"));
		PasswordBox.sendKeys("1234567");
		

	}

}
