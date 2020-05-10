package com.flipkart.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.testbase.Testbase;

public class Tabledata {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		@driver.get 'http://the-internet.herokuapp.com/tables'
//
//		  @driver.find_element(css: '#table1 thead tr th:nth-of-type(4)').click
//		  @driver.find_element(css: '#table1 thead tr th:nth-of-type(4)').click
//
//		  dues = @driver.find_elements(css: '#table1 tbody tr td:nth-of-type(4)')
//		  due_values = dues.map { |due| due.text.delete('$').to_f }
//
//		  expect(due_values).to eql due_values.sort.reverse
 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://the-internet.herokuapp.com/tables");

		List<WebElement> dues = driver.findElements(By.cssSelector("#table1 tbody tr td:nth-of-type(4)"));

		for (WebElement due : dues) {
			String Max_fv = due.getText();
//			int fv = Integer.parseInt(Max_fv);
			System.out.println(Max_fv);
		}
			driver.quit();
	}

}
