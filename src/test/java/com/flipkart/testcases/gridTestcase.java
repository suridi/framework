package com.flipkart.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. creating desrired capabilities
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WIN10);
		cap.setBrowserName("chrome");

//		2. creating chrome options
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
//		3. registering address for the hub
		String huburl = "http://192.168.0.105:4444/wd/hub";
		try {
			WebDriver driver = new RemoteWebDriver(new URL(huburl), options);
			driver.get("https://google.com/");
			String title = driver.getTitle();
			System.out.println(title);
			driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
