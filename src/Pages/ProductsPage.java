package Pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage 
{
	WebDriver _driver;
	
	final String pageUrl = "https://www.uptake.com/products";
	
	public ProductsPage(WebDriver driver)
	{
		_driver = driver;
	}
	
	public void VerifyPageCorrect()
	{
		assertEquals(pageUrl, _driver.getCurrentUrl(), "Wrong Page Visited");
	}
	
	public void GetDemo()
	{
		WebElement demoRequest = _driver.findElement(By.xpath("//*[contains(text(), 'Get a Demo')]"));
		demoRequest.click();
	}
}
