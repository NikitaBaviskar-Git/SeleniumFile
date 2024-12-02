package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		WebElement frame1=driver.findElement(By.id("sampleHeading"));
		System.out.println("Ad1 : "+frame1.getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement frame2=driver.findElement(By.id("sampleHeading"));
		System.out.println("Ad2 : "+frame2.getText());
		
		
		
		driver.close();

	}

}
