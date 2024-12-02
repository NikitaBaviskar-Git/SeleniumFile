package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement check = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/article/div/div/table/tbody/tr[4]/td[1]/input"));
		check.click();
		
		WebElement language =driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/article/div/div/table/tbody/tr[5]/td[5]"));
		System.out.println(language.getText());
		
		WebElement language1 =driver.findElement(By.xpath("//td[text()='English']"));
		System.out.println(language1.getText());
	}

}
