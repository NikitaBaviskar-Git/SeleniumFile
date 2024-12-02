package Selenium.com;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		WebElement RightClick= driver.findElement(By.id("rightClickBtn"));
		Actions act=new Actions(driver);
		act.contextClick(RightClick).perform();
		System.out.println("Right Click Done ");
		
		WebElement DoubleClick= driver.findElement(By.id("doubleClickBtn"));
		act.contextClick(DoubleClick).perform();
		System.out.println("Double Click Done ");
		


		driver.close();
	}

}
