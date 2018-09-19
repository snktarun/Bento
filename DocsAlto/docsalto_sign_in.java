package DocsAlto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class docsalto_sign_in {
	WebDriver driver;
	
	public void init ()
	{
		System.setProperty("webdriver.gecko.driver","/home/tarun/Documents/geckodriver");
		driver = new FirefoxDriver();
	}
	@Test
public void signin() throws InterruptedException

{
	init();
	
	driver.get("http://18.220.197.216/DocsAlto/#/signin");
	driver.manage().window().maximize();

	//Bento Practise id
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("P0362862");
	//password
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("123456");
	//submit
	driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
	Thread.sleep(2000);
}




	
	
	
	
	

}
