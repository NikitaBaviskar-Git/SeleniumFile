package Selenium.com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinelearning.excelr.com/signup");
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		int linklen=links.size();
		System.out.println(linklen);
		
		for(int i=0;i<linklen;i++)
		{
			WebElement element=links.get(i);
			String elemntText=element.getText();
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			HttpURLConnection httpconnect=(HttpURLConnection)link.openConnection();
			httpconnect.connect();
			
			int StatusCode=httpconnect.getResponseCode();
			
			if(StatusCode < 400)
			{
				System.out.println(StatusCode + " : "+ link +" ---"+elemntText + " -->"+"Link is Broken");
			}
			else
			{
				System.out.println("Link is not Broken");
			}
		}

	}

}
