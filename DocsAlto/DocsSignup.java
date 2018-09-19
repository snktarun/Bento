package DocsAlto;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DocsSignup {

	WebDriver driverobj;
	
	public void init()
	{
	System.setProperty("webdriver.gecko.driver","/home/tarun/Documents/geckodriver");
	driverobj = new FirefoxDriver();
	}
@Test	
	public void docsloginpage() throws InterruptedException
	{
	init();
		driverobj.get("http://18.220.197.216/DocsAlto/#/signin");
		driverobj.manage().window().maximize();
		Thread.sleep(1000);
		//Not a member? sign up 
		driverobj.findElement(By.linkText("Not a Member? Sign Up for Free.")).click();
		//driverobj.findElement(By.xpath("/html/body/div/div/div/div[1]/div/form/div/div/div[5]/a")).click();
		//please let me in
		//driverobj.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/form/div/div/div[1]/input")).sendKeys("please let me in");
		//proceed to sign up
		
		driverobj.findElement(By.xpath("/html/body/div/div/div/div[2]/div[3]/div/button")).click();
		Thread.sleep(2000);
		//Step - 1
		//practise name 
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div[1]/div/input")).sendKeys("janata Hospital");
		//First Name
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[3]/div[1]/div/input")).sendKeys("janata");
		//Last Name
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[3]/div[3]/div/input")).sendKeys("director");
		//Select plans 
//		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div[2]/div/div[1]/div/div/input")).click();
//		Thread.sleep(1000);
//		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div[2]/div/div[2]/div/div/input")).click();
//		Thread.sleep(1000);
//		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div[2]/div/div[3]/div/div/input")).click();
//		Thread.sleep(1000);
		//Email
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[4]/div[1]/div/input")).sendKeys("janatadir@yopmail.com");
		Thread.sleep(1000);
		//state lisence
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[4]/div[2]/div/input")).sendKeys("dsfasf34234");
		//state licensed in 
		
		Actions a = new Actions(driverobj);
		a.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).perform();
		
//	 WebElement ele = driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[4]/div[3]/div/div[2]/div[1]/div[2]"));
//	 Actions act = new Actions(driverobj);
//	 act.moveToElement(ele).click().perform();
//	 driverobj.findElement(By.xpath("/html/body/div[5]/div/div/div/div[6]/span/div/div/div[1]")).click();
	 Thread.sleep(3000);
		//SSN
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[5]/div[1]/div/input")).sendKeys("342453555");
		Thread.sleep(3000);
		//Date
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[5]/div[4]/div/div[1]/input")).sendKeys("12/12/1986");
		Thread.sleep(3000);
		//practise address
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[6]/div/div[1]/div/div/input")).sendKeys("Image Hospital");
		//city
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[7]/div[1]/div/input")).sendKeys("Hyderabad");
		//select state
		WebElement stateobj = driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[7]/div[2]/div/div[2]/div[1]/div[2]"));
		   Actions obj1 = new Actions(driverobj);
		   obj1.moveToElement(stateobj).click().perform();
		   driverobj.findElement(By.xpath("/html/body/div[3]/div/div/div/div[10]/span/div/div/div")).click();
		   
		 //phone number
		   Thread.sleep(2000);
			driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[8]/div[2]/div/input")).sendKeys("765456123");
			Thread.sleep(2000);
			//zip code
			driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[7]/div[3]/div/input")).sendKeys("10026");
			//email
			driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[8]/div[1]/div/input")).sendKeys("janatadir@yomail.com");
			//practise web url
			driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[9]/div[1]/div/input")).sendKeys("www.test.com");
			
			//mobile practise
			driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[9]/div[2]/div/div/input")).click();
					
		   //time zone
		   WebElement newobj = driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[8]/div[3]/div/div[2]/div[1]/div[2]"));
		   Actions act2 = new Actions(driverobj);
		   act2.moveToElement(newobj).click().perform();
		   driverobj.findElement(By.xpath("/html/body/div[5]/div/div/div/div[30]/span/div/div/div")).click();
		   Thread.sleep(2000);
		   	   		
   	
		//signature
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[10]/div[1]/div/input")).sendKeys("SINGAM");
		Thread.sleep(2000);
		//terms & conditions
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[10]/div[2]/div/div[1]/div/div/input")).click();
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/button")).click();
		//driverobj.close();
		
		if(driverobj.getPageSource().contains("Sign Up Step 2: Email Verification & Sign Credentials"));
		{
			System.out.println("Text found correct");
			}
		{	
			System.out.println("Text is incorrect format");
		}
	}
}

