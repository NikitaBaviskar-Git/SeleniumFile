package Selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		List<WebElement> Buttons =driver.findElements(By.tagName("button"));
		System.out.println(Buttons.size());
		
		for(WebElement element : Buttons)
		{
			System.out.println(element.getText());
		}
		

	}

}
