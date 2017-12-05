package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Helpers.UiHelpers;

public class UpTakeMainPage {

	private WebDriver _driver;
	
	public UpTakeMainPage(WebDriver driver)
	{
		_driver = driver;
	}
	
	public void GoToPage()
	{
		_driver.get("https://www.uptake.com/");
	}
	
	public void RequestDemo()
	{
		WebElement demoRequest = _driver.findElement(By.xpath("//*[contains(text(), 'Request a Demo')]"));
		demoRequest.click();
	}
	
	public void Contact()
	{
		WebElement demoRequest = _driver.findElement(By.xpath("//*[contains(text(), 'Contact')]"));
		demoRequest.click();
	}
	
}
