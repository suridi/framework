package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.testbase.Testbase;



public class LoginPage extends Testbase {
	
	@FindBy(name="q") private WebElement searchbox;
	@FindBy(name="btnK") private WebElement search_btn;	
	
	public WebDriver driver;
	public LoginPage (WebDriver driver) {
		 this.driver =driver;
	 PageFactory.initElements(driver, this);
	 }
	
	public void search_word(String key_word) {
		searchbox.sendKeys(key_word);
		searchbox.sendKeys(Keys.ENTER);
//			Thread.sleep(3000);
//			search_btn.click();

	}
	


	
}
