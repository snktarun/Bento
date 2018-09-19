package CorpAlto;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DocsAlto.DocsSignup;

public class MainClass {
	


	public void main(String[] args) throws InterruptedException {
			
		CorpAlto_Sign_Up signupObj = new CorpAlto_Sign_Up();
		
		signupObj.loginpage();
		signupObj.signupcode();
		//signupObj.signup();
		
//		WebDriver WebDriver;
//		login loginObj = new login(driverobj);
//	
//		DocsSignup docsobj = new DocsSignup();
//		docsobj.docsloginpage();
		
		
	}

}
