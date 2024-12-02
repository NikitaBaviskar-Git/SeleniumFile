package Selenium.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) {
		//window handle-- unique address of everywindow.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement new_tab=driver.findElement(By.id("tabButton"));
		new_tab.click();
		
		
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		Set<String> windows_open=driver.getWindowHandles();
		
		for(String openwindows:windows_open )
		{
			System.out.println(openwindows);
			if(!parent_window.equals(openwindows)) {
				
				driver.switchTo().window(openwindows);
				
			}
		}
		WebElement childtext=driver.findElement(By.id("sampleHeading"));
		System.out.println(childtext.getText());
		
		driver.close();
		
		driver.switchTo().window(parent_window);
		WebElement window_new=driver.findElement(By.id("windowButton"));
		window_new.click();

		Set<String> windows_opens=driver.getWindowHandles();
		
		for(String openwindows:windows_opens )
		{
			System.out.println(openwindows);
			if(!parent_window.equals(openwindows)) {
				
				driver.switchTo().window(openwindows);
				
			}
			
		}
		WebElement newwindowtext=driver.findElement(By.id("sampleHeading"));
		System.out.println(newwindowtext.getText());
		driver.quit();

	}

}
