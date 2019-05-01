package com.qa.SeleniumGridWithDocker;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	
	public String url="http://www.google.com";
	public String browser="";
	WebDriver driver;
	
	
	@BeforeTest
	public void init() {
		System.out.println("@BeforeTest");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\\\Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	@AfterTest
	public void tearup() {
		driver.close();
	}
	
	@Test
	public void method1() {
		System.out.println("Method1");
	}
	@Test
	public void method2() {
		System.out.println("Method2");
	}
	@Test
	public void method3() {
		System.out.println("Method3");
	}
	@Test
	public void method4() {
		System.out.println("Method4");
	}
}
