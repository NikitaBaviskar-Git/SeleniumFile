package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement Radio = driver.findElement(By.xpath("//input[contains(@value,'benz')]"));
		Radio.click();
		
		WebElement Checkbox = driver.findElement(By.xpath("//input[(@value='bmw'and @type='checkbox')]"));
		Checkbox.click();
		
		WebElement text = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		System.out.println(text.getText());
	}

}
