package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		
		WebElement Fisrtname= driver.findElement(By.id("firstname"));
		Fisrtname.sendKeys("Nikita ");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.keyDown(Keys.TAB);
		act.build().perform();
		act.keyUp(Keys.TAB);
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.build().perform();

		act.keyDown(Keys.PAGE_DOWN);
		act.build().perform();
		act.keyUp(Keys.PAGE_DOWN);
		act.build().perform();
		
/*
		for(int i=0;i<=5;i++)//for scrolling
		{
			act.keyDown(Keys.ARROW_DOWN);
			act.build().perform();
			act.keyUp(Keys.ARROW_DOWN).build().perform();
		}
*/
	}

}
