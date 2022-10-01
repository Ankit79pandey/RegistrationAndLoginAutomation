package com.simplilearn.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRegistration {

	public static void main(String[] args) {
		
	
	
	  String path="D:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe";
	  
	  System.setProperty("webdriver.chrome.driver", path);
	  
	  WebDriver driver=new ChromeDriver();
	  
	  String url="https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=MB45C1W2C25TKEG09Z4X&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
	  driver.get(url);
	  
	  driver.manage().window().maximize();
	  
	  WebElement name=driver.findElement(By.id("ap_customer_name"));
	  name.sendKeys("Ankit pandey");

	  
	  WebElement phone=driver.findElement(By.id("ap_phone_number"));
	  phone.sendKeys("8826436679");

	  WebElement email=driver.findElement(By.id("ap_email"));
	  email.sendKeys("ankit.20m0141080@abes.ac.in");

	  WebElement password=driver.findElement(By.id("ap_password"));
	  password.sendKeys("Ankit@1998");

	  
	  WebElement button=driver.findElement(By.id("continue"));
	  button.submit();
	  
}
}
