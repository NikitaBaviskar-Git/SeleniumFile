package Selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement checkbox = driver.findElement(By.id("bmwcheck"));
		checkbox.click();
		
		WebElement radiobutton = driver.findElement(By.cssSelector("input#hondaradio"));
		radiobutton.click();
		
		WebElement dropdown = driver.findElement(By.id("carselect"));
		Select car = new Select(dropdown);
		car.selectByValue("benz");
		
		List<WebElement> list = car.getOptions();//for selected option
		for(WebElement elements: list)
		{
			System.out.println(elements.getText()+ " is in options for dropdown");
		}
		
		System.out.println("----------------------------------------------------------");
		WebElement multisel = driver.findElement(By.id("multiple-select-example"));
		Select cars = new Select(multisel);
		if(cars.isMultiple())
		{
			System.out.println("Multi select enabled : ");
			cars.selectByVisibleText("Peach");
			cars.selectByVisibleText("Apple");
		}
		else
		{
			System.out.println("Multi select Disabled ");
		}
		List<WebElement> list1 = cars.getAllSelectedOptions();//for selected option
		for(WebElement elements: list1)
		{
			System.out.println(elements.getText()+ " is selcted from options for Multi select");
		}
		

	}

}
