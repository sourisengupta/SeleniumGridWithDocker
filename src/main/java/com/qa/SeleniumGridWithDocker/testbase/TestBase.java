package com.qa.SeleniumGridWithDocker.testbase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public String url="http://www.google.com";
	public String browser="";
	String hubURL="http://10.0.0.107:4444/wd/hub";
	
	public TestBase() {		
	}
	public void initApplication() throws MalformedURLException {
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);*/
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName(BrowserType.CHROME);
		cap.setPlatform(Platform.WIN10);
		
		driver = new RemoteWebDriver (new URL(hubURL),cap);
	}
	public void closeApplication() {
		driver.close();
	}
}
