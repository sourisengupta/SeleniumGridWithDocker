package com.qa.SeleniumGridWithDocker;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.SeleniumGridWithDocker.testbase.TestBase;

public class Testing extends TestBase{
	
	
	//WebDriver driver;
	
	
	@BeforeTest
	public void init() {
		initApplication();
	}
	@AfterTest
	public void tearup() {
		closeApplication();
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
