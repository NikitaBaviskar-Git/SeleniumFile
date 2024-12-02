package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class WebElemets {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement email_txt =driver.findElement(By.name("email"));   //web element for email
		email_txt.sendKeys("abc234@gmail.com");
		
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		String passwordtag = password.getText();
		System.out.println(passwordtag);
		
		WebElement login = driver.findElement(By.id("login"));
		String login_txt=login.getText();
		System.out.println(login_txt);
		
		String logincss= login.getCssValue("backgroung-color");
		System.out.println(logincss);
		String hexa=Color.fromString(logincss).asHex();
		System.out.println();
		String loginattribute = login.getAttribute("id");
		System.out.println(loginattribute);
		
		
	}

}
