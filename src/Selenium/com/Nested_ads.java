package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_ads {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		driver.switchTo().frame(0);
		System.out.println("Switch to outer iframe ");
		
		driver.switchTo().frame(2);
		System.out.println("Switch to inner iframe ");
		
		WebElement e= driver.findElement(By.xpath("input#text"));
		e.sendKeys("Hello");



driver.close();
	}

}
