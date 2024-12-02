package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		WebElement drag= driver.findElement(By.id("draggable"));
		
		WebElement drop= driver.findElement(By.id("droppable"));
		String before_drop=drop.getText();
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		String after_drop="Dropped !";
		if(!before_drop.equals(after_drop))
		{
			System.out.println("Dropped Passed ");
		}
		else
		{
			System.out.println("Dropped Failed ");
		}
	}
}
