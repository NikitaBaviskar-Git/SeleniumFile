package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement show= driver.findElement(By.id("show-textbox"));
		show.click();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//send Value
		js.executeScript("document.getElementById('displayed-text'.value)='hello'");
		
	}

}
/*
JavascriptExecutor js = (JavascriptExecutor)driver;

js.executeScript("arguments[0].click();", element);

*/


