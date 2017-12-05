package Tests;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException
	{
		String sourcePath = System.getProperty("user.dir");
		File file = new File(sourcePath + "/lib/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.uptake.com/");
		
		WebElement firstName = driver.findElement(By.id("firstname-c7ed7b27-03cc-49ef-a175-ecef13772c93"));
		firstName.sendKeys("Anant");
		
		WebElement demoRequest = driver.findElement(By.xpath("//*[contains(text(), 'Request a Demo')]"));
		demoRequest.click();
				
		
	}
}
