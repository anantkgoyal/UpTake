package Tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.UpTakeMainPage;

public class Test1 
{
	@Test
	public void testa() throws InterruptedException
	{
		String sourcePath = System.getProperty("user.dir");
		File file = new File(sourcePath + "/lib/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		
		
		UpTakeMainPage mainPage = new UpTakeMainPage(driver);

		mainPage.GoToPage();
		
		assertFalse(mainPage.FirstNameExists(1));
		assertFalse(mainPage.LastNameExists(1));
				
		mainPage.RequestDemo();
		
		assertTrue(mainPage.FirstNameExists(5));
		assertTrue(mainPage.LastNameExists(5));
		
		driver.close();
		driver.quit();
		
	}
}
