package com.simplilearn.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		
		
		  String path="D:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe";
		  
		  System.setProperty("webdriver.chrome.driver", path);
		  
		  WebDriver driver=new ChromeDriver();
		  
		  String url="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY0NjA3ODY2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D";
				  driver.get(url);
		  
		  driver.manage().window().maximize();
		  
		  
		  WebElement name=driver.findElement(By.name("email"));
		  name.sendKeys("9911027949");
		  
		  WebElement password=driver.findElement(By.name("pass"));
		  password.sendKeys("K1@khushi");
		  
		  WebElement button=driver.findElement(By.id("loginbutton"));
		  button.submit();
		  

		  
	}
}
