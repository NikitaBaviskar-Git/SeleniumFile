package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username =driver.findElement(By.cssSelector("input#email")); 
		username.sendKeys("abchiugfjoe");
		
		//WebElement password =driver.findElement(By.cssSelector("input[id='pass']")); 
		//other attribute apart from id or class
		WebElement password =driver.findElement(By.cssSelector("input[placeholder='Password']")); 
		password.sendKeys("12345");
		
		WebElement title = driver.findElement(By.cssSelector("._8eso"));
		String heading =title.getText();
		System.out.println(heading);
		
		WebElement loginbutton = driver.findElement(By.cssSelector("button[id^='u_0_']"));
		loginbutton.click();
	}

}
