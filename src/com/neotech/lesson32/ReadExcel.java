package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {


		String filePath = System.getProperty("user.dir") + "\\testdata\\Test.xlsx";
		
		System.out.println(filePath);

		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook b = new XSSFWorkbook(fis);
		
		Sheet s = b.getSheet("TestData");
		
		//get the number of rows
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("rows: " + rows);
		
		int cols = s.getRow(0).getLastCellNum();
		System.out.println("cols: " + cols);
		
		System.out.println("--------------------------------");
		
		Map<String, String> yo = new LinkedHashMap<>();
		
		// Looping through all rows and columns
		for (int row = 0; row < rows; row++ )
		{
			// iterating rows
			
			for(int col = 0; col < cols; col++)
			{
				//iterating columns
				String cellValue = s.getRow(row).getCell(col).toString();
				System.out.print(cellValue + " ");
				
			yo.put(s.getRow(row).toString(), s.getRow(row).getCell(col).toString());
				
				
				
			}
			System.out.println();
			
		}
		System.out.println(yo);
		
		b.close(); // need to close after done. will release the memory
	}

}
