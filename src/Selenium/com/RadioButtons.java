package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement maleradiobutton =driver.findElement(By.cssSelector("input[value='2']"));
		maleradiobutton.click();
		
		if(maleradiobutton.isSelected())
		{
			System.out.println("Yes selected");
		}
		else
		{
			System.out.println("Not selected");
		}
		
		
	}

}
