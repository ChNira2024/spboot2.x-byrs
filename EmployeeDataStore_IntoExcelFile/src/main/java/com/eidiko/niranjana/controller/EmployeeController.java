package com.eidiko.niranjana.controller;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.Employee;

@RestController
public class EmployeeController {
	
	
			@PostMapping("/excelData")
			public void DataInsertIntoExcel( @RequestBody Employee xls)
			{					
				//here we create empty workbook
		        XSSFWorkbook workbook = new XSSFWorkbook();  
		       
		        
		      //Create a blank sheet
		        XSSFSheet sheet = workbook.createSheet( "Sheet1");
		        //Create row object
		        XSSFRow rowhead = sheet.createRow(0);
		        rowhead.createCell(0).setCellValue("empId");
			    rowhead.createCell(1).setCellValue("empName");
			    rowhead.createCell(2).setCellValue("empRole");
			     rowhead.createCell(3).setCellValue("empSalary");
			     rowhead.createCell(4).setCellValue("empCity");
			     rowhead.createCell(5).setCellValue("empContact");
		       XSSFRow rowhead1 = sheet.createRow(1);
		       rowhead1.createCell(0).setCellValue(xls.getEmpId());
		       rowhead1.createCell(1).setCellValue(xls.getEmpName());
		       rowhead1.createCell(2).setCellValue(xls.getEmpRole());
		       rowhead1.createCell(3).setCellValue(xls.getEmpSalary());
		       rowhead1.createCell(4).setCellValue(xls.getEmpCity());
		       rowhead1.createCell(5).setCellValue(xls.getEmpContact());
		   
		       try {
		       File f1 = new File("C:\\sts\\Niranjana\\EmployeeDataStore_IntoExcelFile\\src\\main\\java\\com\\eidiko\\niranjana\\xls\\Test.xls");
				FileOutputStream fos = new FileOutputStream(f1);
			        workbook.write(fos);
			        fos.close();
			        workbook.close();
		       }
		       catch(Exception e)
		       {
		    	   e.printStackTrace();
		       }
		       System.out.println("ok...Done");
			}
}
