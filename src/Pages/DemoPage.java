package Pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helpers.UiHelpers;

public class DemoPage {

	static WebDriver _driver;
	public DemoPage(WebDriver driver)
	{
		_driver = driver;
	}
	
	private boolean FirstNameExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=firstname]"), timeOut);
	}
	
	private boolean LastNameExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=lastname]"), timeOut);
	}
	
	private boolean EmailExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=email]"), timeOut);
	}
	
	private boolean CompanyExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=company]"), timeOut);
	}
	
	private boolean IndustryExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=vertical]"), timeOut);
	}
	
	private boolean EmployeeCountExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=number_of_employees]"), timeOut);
	}
	
	private boolean EmployeeFunctionExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=function_role]"), timeOut);
	}
	
	public void AssertDemoPageElementsDoNotExist()
	{

		assertFalse(FirstNameExists(1));
		assertFalse(LastNameExists(1));
		assertFalse(EmailExists(1));
		assertFalse(CompanyExists(1));
		assertFalse(IndustryExists(1));
		assertFalse(EmployeeCountExists(1));
		assertFalse(EmployeeFunctionExists(1));
	}
	
	public void AssertDemoPageElementsExist()
	{
		assertTrue(FirstNameExists(5));
		assertTrue(LastNameExists(1));
		assertTrue(EmailExists(1));
		assertTrue(CompanyExists(1));
		assertTrue(IndustryExists(1));
		assertTrue(EmployeeCountExists(1));
		assertTrue(EmployeeFunctionExists(1));
	}
}
