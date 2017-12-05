package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage 
{
	WebDriver _driver;
	public ProductsPage(WebDriver driver)
	{
		_driver = driver;
	}
	
	public void GetDemo()
	{
		WebElement demoRequest = _driver.findElement(By.xpath("//*[contains(text(), 'Get a Demo')]"));
		demoRequest.click();
	}
}
