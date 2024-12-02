package Selenium.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Action_Keyboard {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		/*
		
		for(int i=0;i<=8;i++)//for scrolling
		{
			act.keyDown(Keys.ARROW_DOWN);
			act.build().perform();
			act.keyUp(Keys.ARROW_DOWN).build().perform();
		}
		*/
		WebElement Fullname= driver.findElement(By.id("userName"));
		Fullname.sendKeys("Nikita Baviskar");
		
		WebElement Email= driver.findElement(By.id("userEmail"));
		Fullname.sendKeys("abc@gmail.com");
		
		
		WebElement Current_add= driver.findElement(By.id("currentAddress"));
		Current_add.sendKeys("Pune");
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
			
		//sreenshot
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("D:\\Screenshot\\image.png"));
		



	}

}
