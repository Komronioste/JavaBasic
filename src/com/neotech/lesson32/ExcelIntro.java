package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {


		String filePath = "C:\\Users\\TWD Admin\\Documents\\Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		// read the workbook/excel file
		Workbook book = new XSSFWorkbook(fis);
		
		//Accessing the sheet that I want to read
		Sheet sheet = book.getSheet("Sheet1");

		//Accessing the row that I want to read
		Row row = sheet.getRow(0);
	
		//Accessing the cell that I want to read
		Cell cell = row.getCell(1);
		
		//Getting data/information from the cell
		String info = cell.toString();
	
		System.out.println(info);
		
		Row row2 = sheet.getRow(2);
		Cell cell3 = row2.getCell(3);
		
		String info2 = cell3.toString();
		System.out.println(info2);
		
		
		//How to get Garfield
		String cellInfo = sheet.getRow(1).getCell(2).toString();
		System.out.println(cellInfo);
		
		//How to get numeric value
		double cellDoubleValue = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(cellDoubleValue);
		
		//downcast to an integer
		int intValue = (int) cellDoubleValue;
		System.out.println(intValue);
		
		//I can get zip as a String
		String zip = sheet.getRow(1).getCell(4).toString();
		System.out.println(zip);
		
		
	}

}
