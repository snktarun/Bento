package CorpAlto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CorpAlto_Sign_In {

	WebDriver driverobj;
	
	public void init()
	{
	System.setProperty("webdriver.gecko.driver","/home/tarun/Documents/geckodriver");
	driverobj = new FirefoxDriver();
	}
@Test(priority =1)
public void successloginpage() throws InterruptedException
	{
	init();
		
		driverobj.get("http://18.220.197.216/CorpAlto/#/Sign-In");
		driverobj.manage().window().maximize();
		
		//employer id
		driverobj.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("E2114966");
		
		//password
		driverobj.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("123456");
		
		//submit
		driverobj.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		Thread.sleep(2000);
	
		}
//Failure case -1 
@Test(priority =0)
public void failureloginpage() throws InterruptedException
	{
	init();
		
		driverobj.get("http://18.220.197.216/CorpAlto/#/Sign-In");
		driverobj.manage().window().maximize();
		
		//employer id
		driverobj.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("E2114966");
		
		//password
		driverobj.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("");
		
		//submit
		driverobj.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		//error message
	driverobj.findElement(By.xpath("//div[contains(text,'Password is required!')]")).getText();
	
		
		Thread.sleep(2000);
	}
	
	}

