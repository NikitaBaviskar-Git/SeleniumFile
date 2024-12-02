package Selenium.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement element=driver.findElement(By.id("tabButton"));
		element.click();
		
		String parent_window = driver.getWindowHandle();
		System.out.println(parent_window);
		
		Set<String> Window_open = driver.getWindowHandles();
		
		for(String openwin :Window_open)
		{
			System.out.println(openwin);
			if(!parent_window.equals(Window_open))
			{
				driver.switchTo().window(parent_window);
				WebElement Childtext = driver.findElement(By.id("sampleHeading"));
				System.out.print(Childtext.getText());
				
				driver.close();
				
				driver.switchTo().window(parent_window);
				WebElement Parent = driver.findElement(By.id("windowButton"));
				Parent.click();
				
			}
		}
		

	}

}
