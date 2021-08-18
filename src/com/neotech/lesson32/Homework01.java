package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework01 {

	public static void main(String[] args) throws IOException {


		String filePath = "C:\\Users\\TWD Admin\\eclipse-workspace\\JavaBasic\\testdata\\Homework.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook b = new XSSFWorkbook(fis);
		
		Sheet s = b.getSheet("Companies");
		
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("rows: " + rows);
		
		int cols = s.getRow(0).getLastCellNum();
		System.out.println("cols: " + cols);
		
		
		ArrayList<String> google = new ArrayList<>();
		
		for ( int i =0; i < cols; i++)
			google.add(s.getRow(2).getCell(i).toString());
		
		System.out.println(google);
		
		Set <Double> salaries = new HashSet<>();
		
		for (int i = 1; i < rows; i ++)
		{
			salaries.add(s.getRow(i).getCell(4).getNumericCellValue());
		}
		
		System.out.println(salaries);
		b.close(); 
//		
//		
//		
		
		

	}

}
