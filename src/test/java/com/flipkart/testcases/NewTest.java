package com.flipkart.testcases;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flipkart.pages.LoginPage;
import com.flipkart.testbase.Testbase;
import com.flipkart.utils.utilfunctions;

public class NewTest extends Testbase {
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {
	getDriver("chromebrowser", "url");
		
	}

	@Test
	public void Searchtests() {
		// TODO Auto-generated method stub
//		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		long id = Thread.currentThread().getId();
	    System.out.println("Searchtests. Thread id is: " + id);
		loginPage = new LoginPage(driver);
		try {
			Thread.sleep(1000);
			loginPage.search_word("selenium");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
//	@DataProvider()
	public void verifybrowsertitle() {
		long id = Thread.currentThread().getId();
		System.out.println("verifybrowsertitle. Thread id is: " + id);
		String expected = "automation - Google Search";
		try {
			Thread.sleep(3000);
			loginPage = new LoginPage(driver);
			String key;
			try {
				key = utilfunctions.excelDataReader(0, "C:\\SampleProject\\SApps\\Testdata\\Testdata.xlsx");
				loginPage.search_word(key);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found in the path"+e.getMessage());
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
	}

	@AfterMethod
	public void wrapuptest(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			try{
			TakesScreenshot screenshot =(TakesScreenshot)driver;
			File src =screenshot.getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			FileUtils.copyFile(src, new File("C:\\SampleProject\\SApps\\screenshots\\"+result.getName()+timestamp+".png"));
			System.out.println("Screenshot captured successfully"+result.getName());
			}catch(Exception e) {
				System.out.println("Exception while taking screenshot" +e.getMessage());
			}
		}
		System.out.println("Executing after tests");
		driver.quit();
	}
}