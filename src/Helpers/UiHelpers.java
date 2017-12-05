package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UiHelpers {

	public static boolean CheckElementExists(WebDriver driver, By reference, int secondTimeOut)
	{
		long sleepTime = 500;
		
		long timeElapsed = 0;
		
		while(timeElapsed < secondTimeOut * 1000)
		{
			try
			{
				Thread.sleep(sleepTime);
				driver.findElement(reference);
				return true;
			}
			catch(Exception e)
			{
				System.out.println(timeElapsed);
				//Swallow exception
			}
			timeElapsed += sleepTime;
		}
		
		return false;
	}
	
}
