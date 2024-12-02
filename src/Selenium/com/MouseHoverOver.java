package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		
		WebElement Hover= driver.findElement(By.linkText("Main Item 2"));
		Actions act=new Actions(driver);
		act.moveToElement(Hover).perform();
		System.out.println("Hover Done ");
		
		WebElement SubHover= driver.findElement(By.linkText("SUB SUB LIST »"));
		act.moveToElement(SubHover).perform();
		System.out.println("SubHover Done ");
		
		
		
		
	}
	
	
	






}
