package com.stepdef;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks{
	WebDriver driver;
	
	public void takeScreenshotsOnFailure(Scenario scenario)
	{
		//@Before(order = 0)
		if(scenario.isFailed())
		{
			//TakesScreenshot driver;
			TakesScreenshot ts= (TakesScreenshot) driver;
			byte[] src =ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "img/png", "screenshot");
		}
	}
	//@After(order=0)
	public void tearDown()
	{
		
		//driver.close();
	}

}
