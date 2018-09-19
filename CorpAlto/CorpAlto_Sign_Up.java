package CorpAlto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CorpAlto_Sign_Up {
	
	WebDriver driver;
	
	public void tarun() throws InterruptedException {
		
		System.out.println("welcome");
		System.setProperty("webdriver.gecko.driver","/home/tarun/Documents/geckodriver");
		
		driver = new FirefoxDriver();
	}
	@Test(priority = 0)
public void loginpage() throws InterruptedException {
	tarun();
     driver.get("http://18.220.197.216/CorpAlto/#/Sign-In");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@href='#/Sign-Up-Code']")).click();
	}
	@Test(priority = 1)
public void signupcode() throws InterruptedException {

	//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("please let me in");

//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//div[contains(@class,'sign-in-button')]//div[contains(@class, 'button')]")).click();
//		Thread.sleep(2000);
//	
//Not a Member ? sign in ...
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div/div[4]/a[2]")).click();
	//Proceed to sign up
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/button")).click();
	
		// company name
	driver.findElement(By.name("company_name")).sendKeys("yupp");
		// company address1
driver.findElement(By.xpath("//*[@id='form_view']/form/div[1]/div[2]/div[1]/div/input")).sendKeys("image address");
		// comapny address2

	driver.findElement(By.xpath("//*[@id='form_view']/form/div[1]/div[2]/div[2]/div/input")).sendKeys("hyderbad");
		// city
		
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[3]/div[1]/div/input")).sendKeys("Arizona");

	//state drop down
	driver.findElement(By.xpath("//div[@class ='css-1rtrksz']")).click();
	Thread.sleep(1000);
		
 Actions a = new Actions(driver);
	a.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).perform();
	Thread.sleep(1000);
	
	Thread.sleep(2000);
	
		//zipcode
	driver.findElement(By.xpath("//input(contains[@type,'text']")).sendKeys("10026");
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[3]/div[3]/div/input")).sendKeys("10026");
	//first name
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[4]/div[1]/div/input")).sendKeys("yupp");
		//last name 
		driver	.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[4]/div[3]/div/input")).sendKeys("corp");
		//office email address
		driver	.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[5]/div[1]/div/input")).sendKeys("yuppcorp@yopmail.com");
		//phone number
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[5]/div[2]/div/input")).sendKeys("4567891324");
		Thread.sleep(1000);
		//agree terms of service
driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[6]/div/div[1]/div[1]/input")).click();
// Thread.sleep(1000);
 //sign up
 driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[2]/div/button")).click();
     
	//driver.close();		
 }

}


