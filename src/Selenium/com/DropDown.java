package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		//date
		Select date = new Select(Day);
		date.selectByValue("31");
		
		//date.selectByIndex(9);
		
		WebElement Months = driver.findElement(By.name("birthday_month"));
		//month
		Select month = new Select(Months);
		month.selectByVisibleText("Dec");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		//month
		Select yr = new Select(Year);
		yr.selectByVisibleText("2002");
		//yr.selectByValue("2022");
		
		

	}

}
