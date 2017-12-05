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
	
	public boolean FirstNameExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=firstname]"), timeOut);
	}
	
	public boolean LastNameExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=lastname]"), timeOut);
	}
	
	public boolean EmailExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=email]"), timeOut);
	}
	
	public boolean CompanyExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=company]"), timeOut);
	}
	
	public boolean IndustryExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=vertical]"), timeOut);
	}
	
	public boolean EmployeeCountExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=number_of_employees]"), timeOut);
	}
	
	public boolean EmployeeFunctionExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=function_role]"), timeOut);
	}
	
	public boolean PhoneNumberExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=phone]"), timeOut);
	}
	
	public boolean HelpCategoryExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=how_can_we_help]"), timeOut);
	}
	
	public boolean HelpDescriptionExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=description]"), timeOut);
	}
}
