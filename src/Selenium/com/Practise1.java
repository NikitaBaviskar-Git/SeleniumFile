package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Practise1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username_box = driver.findElement(By.id("user-name"));
		username_box.sendKeys("standard_user");
		if(username_box.isDisplayed() && username_box.isEnabled())
		{
			System.out.println("username box displayed and enabled");
		}
		else
		{
			System.out.println("username box is not displayed and enabled");
		}
		
		WebElement password_box = driver.findElement(By.id("password"));
		password_box.sendKeys("secret_sauce");
		
		if(password_box.isDisplayed() && password_box.isEnabled())
		{
			System.out.println("Password box displayed and enabled");
		}
		else
		{
			System.out.println("Password box is not displayed and enabled");
		}
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		String logincss=loginButton.getCssValue("background-color");
		System.out.println(logincss);
		String login_hex =Color.fromString(logincss).asHex();
		System.out.println(login_hex);
		
		String org_hex="3ddc91";
		if(login_hex.equals(org_hex))
		{
			System.out.println("Original hex match");
		}
		else
		{
			System.out.println("original hex not match");
		}
		Dimension login_dim=loginButton.getSize();
		System.out.println("width: "+login_dim.width);
		System.out.println("height: "+login_dim.height);
		
		String username_attribute = username_box.getAttribute("placeholder");
		System.out.println("Username Attributes are : "+username_attribute);
	}

}
