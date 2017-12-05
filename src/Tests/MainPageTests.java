package Tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ContactPage;
import Pages.DemoPage;
import Pages.ProductsPage;
import Pages.UpTakeMainPage;

public class MainPageTests 
{
	static UpTakeMainPage _mainPage;
	static ContactPage _contactPage;
	static DemoPage _demoPage;
	static ProductsPage _products;
	
	static WebDriver _driver;
	@BeforeClass
	public static void SetUpClass()
	{
		String sourcePath = System.getProperty("user.dir");
		File file = new File(sourcePath + "/lib/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		_driver = new ChromeDriver();
		
		_mainPage = new UpTakeMainPage(_driver);
		_contactPage = new ContactPage(_driver);
		_demoPage = new DemoPage(_driver);
		_products = new ProductsPage(_driver);
	}
	
	@AfterClass
	public static void TearDownClass()
	{
		_driver.close();
		_driver.quit();
	}
	
	@Before
	public void RefreshTest()
	{
		_mainPage.GoToPage();	
	}
	
	@Test
	public void RequestDemoTest() throws InterruptedException
	{			
		_demoPage.AssertDemoPageElementsDoNotExist();				
		_mainPage.RequestDemo();
		_demoPage.AssertDemoPageElementsExist();
	}
	
	@Test
	public void ContactUsTest() throws InterruptedException
	{			
		_contactPage.AssertContactPageElementsDoNoExist();		
		_mainPage.Contact();		
		_contactPage.AssertContactPageElementsExist();		
	}
	
	@Test
	public void ProductDemoTest()
	{
		_mainPage.Products();
		_demoPage.AssertDemoPageElementsDoNotExist();	
		_products.VerifyPageCorrect();
		_products.GetDemo();
		_demoPage.AssertDemoPageElementsExist();
	}
}
