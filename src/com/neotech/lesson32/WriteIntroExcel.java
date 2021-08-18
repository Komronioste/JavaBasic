package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntroExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath = System.getProperty("user.dir")+ "\\testdata\\Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook();
		
		Sheet sheet = book.getSheet("TestData");
		
		//I want to write into row with index 0
		sheet.getRow(0).createCell(5).setCellValue("Country");
		
		//I want to create a new row and write Shodmon in first cell
		
		sheet.createRow(3).createCell(0).setCellValue("Shodmon");
		
		//Create new sheet
		book.createSheet("Burak");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		book.write(fos);  
		
		
		
		
		
		
	}

}
