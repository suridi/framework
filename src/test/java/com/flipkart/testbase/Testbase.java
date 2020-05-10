package com.flipkart.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Testbase {
	
	public  WebDriver driver;
	public static Properties prop;
	
	
	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream input = new FileInputStream(
					"C:\\SampleProject\\SApps\\src\\test\\java\\com\\flipkart\\configuration\\config.properties");
			prop.load(input);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	public  WebDriver getDriver(String bName, String url) {
		String URL = prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		switch (bName.toLowerCase()) {
		case "chromebrowser":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("browser : " + bName + " is invalid, Launching Chrome as browser of choice..");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}

	
	public void closeApplication() {
		System.out.println("---------Executing After Tests----------------");
		driver.quit();
	}

	


	
}
