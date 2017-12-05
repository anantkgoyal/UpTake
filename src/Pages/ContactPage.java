package Pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helpers.UiHelpers;

public class ContactPage 
{
	WebDriver _driver;
	
	public ContactPage(WebDriver driver)
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
	
	private boolean PhoneNumberExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=phone]"), timeOut);
	}
	
	private boolean HelpCategoryExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=how_can_we_help]"), timeOut);
	}
	
	private boolean HelpDescriptionExists(int timeOut)
	{
		return UiHelpers.CheckElementExists(_driver, By.cssSelector("[id*=description]"), timeOut);
	}
	
	public void AssertContactPageElementsDoNoExist()
	{
		assertFalse(FirstNameExists(1));
		assertFalse(LastNameExists(1));
		assertFalse(EmailExists(1));
		assertFalse(PhoneNumberExists(1));
		assertFalse(HelpCategoryExists(1));
		assertFalse(HelpDescriptionExists(1));
	}
	
	public void AssertContactPageElementsExist()
	{
		assertTrue(FirstNameExists(5));
		assertTrue(LastNameExists(1));
		assertTrue(EmailExists(1));
		assertTrue(PhoneNumberExists(1));
		assertTrue(HelpCategoryExists(1));
		assertTrue(HelpDescriptionExists(1));
	}
	
}
