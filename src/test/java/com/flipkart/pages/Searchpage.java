package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchpage {
	
	static WebDriver driver= null;
	
	public static WebDriver getDriver() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		return driver;
	}

	public static void testComplete() {
		driver.quit();
	}
}
