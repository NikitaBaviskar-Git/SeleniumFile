package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://xndev.com/display-image/");

		WebElement upload1= driver.findElement(By.cssSelector("input[type='file']"));
		upload1.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots");




	}

}
