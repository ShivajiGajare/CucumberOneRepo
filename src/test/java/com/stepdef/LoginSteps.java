package com.stepdef;

import java.util.function.Function;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.exec.util.*;
import org.apache.commons.io.FileUtils;

import io.cucumber.java.en.*;

public class LoginSteps {
	WebDriver driver;
	
	Wait wait;
	@Given("user is on login page")
	public void user_is_on_login_page() {

			System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
			driver = new ChromeDriver();	
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
		}
		
	@When("user enters name and password")
	public void user_enters_name_and_password() throws InterruptedException {
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
				
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException{
		driver.quit();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		
	}
	
	


@Given("Browser is Launched and maximized")
public void browser_is_launched_and_maximized() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
}
@When("Select Item")
public void select_item() throws InterruptedException{
	driver.findElement(By.xpath("//div/button[@class='_2KpZ6l _2doB4z']")).click();
	//	wait.until((Function) driver.findElement(By.xpath("//div/img[@class='_396cs4' and @alt='Mobiles & Tablets']")));
		driver.findElement(By.xpath("//div/img[@class='_396cs4' and @alt='Mobiles']")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);

}
@When("Add Item to Cart")
public void add_item_to_cart() throws InterruptedException{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,4500)");
	Thread.sleep(5000);
	driver.navigate().refresh();
	js.executeScript("window.scrollBy(0,4500)");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//a[@title='realme GT 2 (Paper White, 128 GB)' and @class='s1Q9rs']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//img[@class='_396cs4' and @loading='eager' and @alt='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']")).click();
	//Thread.sleep(2500);
	js.executeScript("window.scrollBy(0,500)");
//	Thread.sleep(2500);
//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

	Thread.sleep(2500);
	ArrayList<String> array=new ArrayList<>(driver.getWindowHandles());
	//driver.getWindowHandle();
driver.switchTo().window(array.get(1));
String url1 = driver.getCurrentUrl();
System.out.println("Url" +url1);

}
@Then("Item is Added to Cart")
public void item_is_added_to_cart() throws InterruptedException,IOException{

	Thread.sleep(2500);
	String url1 = driver.getCurrentUrl();
	if (url1.contains("https://www.flipkart.com/realme-gt-2-paper-white-128-gb/p/"))
	
	{
		System.out.println("Pass" +"  " +url1);
	}
	else
	{
		System.out.println("Fail" + "  " +url1);
	}
	
	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	//X getScreenshotAs(OutputType(X). target) throws WebDriverException
	//FileUtils.copyFile(file,new File(".//screenshot/screen.png"));
	//File desc=new File("C:\\Users\\sgajare\\OneDrive - Capgemini\\Desktop\\Selenium Training\\Java Programs");
	
	//FileUtils.copyFile(desc,new File(".//screenshot/screen.png"));
	FileUtils.copyFile(file,new File(".//screenshot/screen1.png"));
	
}



}
