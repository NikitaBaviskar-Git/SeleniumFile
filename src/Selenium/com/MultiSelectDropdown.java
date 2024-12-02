package Selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement Multiselect =driver.findElement(By.name("cars"));
		Select ms = new Select(Multiselect);
		
		if(ms.isMultiple())
		{
			System.out.println("Multi select enabled ");
			ms.selectByVisibleText("Audi");
			ms.selectByVisibleText("Volvo");
			
		}
		else
		{
			System.out.println("Multi select Disabled ");
		}
		/*
		List<WebElement> list = ms.getOptions();//for selected option
		for(WebElement elements: list)
		{
			System.out.println(elements.getText());
		}
		
		List<WebElement> list1 = ms.getAllSelectedOptions();//all options
		for(WebElement elements: list1)
		{
			System.out.println(elements.getText());
		}

		 */
		
			
		
	
	}

}
