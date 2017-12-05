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
	
	public boolean FirstNameExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.id("firstname-c7ed7b27-03cc-49ef-a175-ecef13772c93"), timeOut);
	}
	
	public boolean LastNameExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.id("lastname-c7ed7b27-03cc-49ef-a175-ecef13772c93"), timeOut);
	}
	
	public boolean EmailExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.id("email-c7ed7b27-03cc-49ef-a175-ecef13772c93"), timeOut);
	}
	
	public boolean CompanyExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.id("company-c7ed7b27-03cc-49ef-a175-ecef13772c93"), timeOut);
	}
	
	public boolean IndustryExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.id("vertical-c7ed7b27-03cc-49ef-a175-ecef13772c93"), timeOut);
	}
	
	public boolean EmployeeCountExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.id("number_of_employees__c-c7ed7b27-03cc-49ef-a175-ecef13772c93"), timeOut);
	}
	
	public boolean EmployeeFunctionExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.id("what_is_your_function_role_in_your_company_-c7ed7b27-03cc-49ef-a175-ecef13772c93"), timeOut);
	}
}
