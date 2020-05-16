package com.learn.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01_J {
	
	@Test
	public void test(){
			
		System.out.println("First java-testng code");
		System.out.println("First java-testng code through jenkins");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//server//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.quit();
	}

}