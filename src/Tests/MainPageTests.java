package Tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.UpTakeMainPage;

public class MainPageTests 
{
	static UpTakeMainPage _mainPage;
	static WebDriver _driver;
	@BeforeClass
	public static void SetUpClass()
	{
		String sourcePath = System.getProperty("user.dir");
		File file = new File(sourcePath + "/lib/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		_driver = new ChromeDriver();
		
		_mainPage = new UpTakeMainPage(_driver);
	}
	
	@AfterClass
	public static void TearDownClass()
	{
		_driver.close();
		_driver.quit();
	}
	
	@Test
	public void RequestDemoTest() throws InterruptedException
	{
		_mainPage.GoToPage();
		
		assertFalse(_mainPage.FirstNameExists(1));
		assertFalse(_mainPage.LastNameExists(1));
		assertFalse(_mainPage.EmailExists(1));
		assertFalse(_mainPage.CompanyExists(1));
		assertFalse(_mainPage.IndustryExists(1));
		assertFalse(_mainPage.EmployeeCountExists(1));
		assertFalse(_mainPage.EmployeeFunctionExists(1));
				
		_mainPage.RequestDemo();
		
		assertTrue(_mainPage.FirstNameExists(5));
		assertTrue(_mainPage.LastNameExists(1));
		assertTrue(_mainPage.EmailExists(1));
		assertTrue(_mainPage.CompanyExists(1));
		assertTrue(_mainPage.IndustryExists(1));
		assertTrue(_mainPage.EmployeeCountExists(1));
		assertTrue(_mainPage.EmployeeFunctionExists(1));
	}
	
	@Test
	public void ContactUsTest() throws InterruptedException
	{
		_mainPage.GoToPage();
		
		assertFalse(_mainPage.FirstNameExists(1));
		assertFalse(_mainPage.LastNameExists(1));
		assertFalse(_mainPage.EmailExists(1));
		assertFalse(_mainPage.PhoneNumberExists(1));
		assertFalse(_mainPage.HelpCategoryExists(1));
		assertFalse(_mainPage.HelpDescriptionExists(1));
				
		_mainPage.Contact();
		
		assertTrue(_mainPage.FirstNameExists(5));
		assertTrue(_mainPage.LastNameExists(1));
		assertTrue(_mainPage.EmailExists(1));
		assertTrue(_mainPage.PhoneNumberExists(1));
		assertTrue(_mainPage.HelpCategoryExists(1));
		assertTrue(_mainPage.HelpDescriptionExists(1));
	}
}
