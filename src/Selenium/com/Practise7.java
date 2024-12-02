package Selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise7 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		WebElement Username=driver.findElement(By.cssSelector("input[placeholder='Username']"));
		Username.sendKeys("Admin");
		
		WebElement Password=driver.findElement(By.cssSelector("input[placeholder='Password']"));
		Password.sendKeys("admin123");
		
		WebElement login_click=driver.findElement(By.cssSelector("button[type='submit']"));
		login_click.click();
		
		WebElement Myinfo_click=driver.findElement(By.linkText("My Info"));
		Myinfo_click.click();
		
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN);
		act.build().perform();
		act.keyUp(Keys.PAGE_DOWN);
		act.build().perform();
		
		
		WebElement Add=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button"));
		Add.click();
		

		WebElement Browser=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));
		Browser.click();
		
		Robot robo =new Robot();
		
		StringSelection st = new StringSelection("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot (28)");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, st);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Filename=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[2]"));
		String FileUpload=Filename.getText();
		String Original="No file selected";
		
		if(FileUpload.equals( Original))
		{
			System.out.println("Sent Successfully");
		}
		else
		{
			System.out.println("Sent Failed");
		}
		
	}

}
