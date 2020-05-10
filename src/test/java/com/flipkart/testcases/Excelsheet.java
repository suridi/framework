package com.flipkart.testcases;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelsheet {

	
	public static void myExcelsheetReader() throws IOException {

		File source = new File("D:\\Practise\\Data.xlsx");
		FileInputStream fs = new FileInputStream(source);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		int cols = row.getLastCellNum();
		int rows = sh.getLastRowNum();
		XSSFCell celval;
		String b;
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<=cols-1;j++) {
				celval = sh.getRow(i).getCell(j);
				b=celval.getStringCellValue();
			System.out.println(b);
			}
		} 
		
		
			
	}

}
