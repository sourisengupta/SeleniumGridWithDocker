package com.qa.SeleniumGridWithDocker.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public String url="http://www.google.com";
	public String browser="";
	
	public TestBase() {		
	}
	public void initApplication() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
	}
	public void closeApplication() {
		driver.close();
	}
}
