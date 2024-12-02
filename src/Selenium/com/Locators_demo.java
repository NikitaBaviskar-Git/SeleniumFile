package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_demo
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement email_txt =driver.findElement(By.name("email"));   //web element for email
		email_txt.sendKeys("abc234@gmail.com");
		
		if (email_txt.isDisplayed() && email_txt.isEnabled())
		{
			System.out.println("Email box is displayed and enabled ");
		}
		else
		{
			System.out.println("Email box is not displayed");
		}
		WebElement password = driver.findElement(By.id("pass"));
		String passwordtag = password.getText();
		System.out.println(passwordtag+"password");
		
		password.sendKeys("12345");
		password.clear();//erase value 
		password.sendKeys("abcdefghi");
		
		
		 WebElement login = driver.findElement(By.id("login"));
		String login_txt=login.getText();
		System.out.println(login_txt);
		// login.click(); // for button tags only
		login.submit();		
		

		
		
	}

}
