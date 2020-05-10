package com.flipkart.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.ObjectData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utilfunctions {
	
 public static String excelDataReader(int sheetindex , String filepath) throws IOException {	
	
		File input = new File(filepath);
		FileInputStream fis = new FileInputStream(input);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetindex);
		int rowcount = sheet.getLastRowNum();
		int rowcount1 = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println("my rowcount"+rowcount);
		System.out.println("rowcount of guru99"+rowcount1);
		String data=null ;
		for (int i = 0; i < rowcount+1; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				data = row.getCell(j).getStringCellValue();
//				System.out.println(row.getCell(j).getStringCellValue());				
			}

		}
		return data;
	
		
	
 }

}
