package Selenium.com;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		WebElement element=driver.findElement(By.linkText("Learn more & submit!"));
		element.click();
		System.out.println(" Clicked Successfull");
		
		String parent_window = driver.getTitle();
		System.out.println("Title of Parent Window : "+parent_window);
		
		String original_window=driver.getWindowHandle();
		Set<String> windows_open=driver.getWindowHandles();
		
		for(String element1:windows_open )
		{
			
			if(!original_window.equals(element1)) 
			{
				driver.switchTo().window(element1);
			}
		}
		String child_window = driver.getTitle();
		System.out.print("Title of Child Window : " +child_window);
		
		driver.quit();
	}
}
