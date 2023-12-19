package com.eidiko.niranjana.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainClass {

	public static void main(String[] args) throws IOException {
		String data="C:\\Users\\Sreenivas Bandaru\\Downloads\\Eidiko\\TestData.xlsx";
		
			FileInputStream inputstream = new FileInputStream(data);
			XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			//read Excel using for-loop
			int rows =  sheet.getLastRowNum();
			int cols = sheet.getRow(1).getLastCellNum();
			for(int r=0; r<=rows; r++)
			{
				XSSFRow row = sheet.getRow(r);
				for(int c=0; c<=cols;c++)
				{
					XSSFCell cell = row.getCell(c);
					//System.out.println("hi"+cell);    //null
					switch(cell.getCellType())
					{
					case STRING: System.out.print(cell.getStringCellValue());break;
					case NUMERIC: System.out.print(cell.getNumericCellValue());break;
					case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
					}
					System.out.print(" | ");
				}
				System.out.println();
				
			}
		

	}

}
