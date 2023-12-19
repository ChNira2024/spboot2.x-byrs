package com.eidiko.niranjana.service.impl;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.entity.Employee;
import com.eidiko.niranjana.repo.IEmployeeRepo;
import com.eidiko.niranjana.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepo repo;
	String line;
	@Override
	public void insertExcelToDB()  {
		
		//Excel
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Sreenivas Bandaru\\Downloads\\Eidiko\\locations.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Locations Data");
			
			int rows=sheet.getLastRowNum();
			
			for(int r=1;r<=rows;r++)
			{
				XSSFRow row=sheet.getRow(r);
				double LOCATION_ID=row.getCell(0).getNumericCellValue();
				String STREET_ADDRESS=row.getCell(1).getStringCellValue();
				String POSTAL_CODE=row.getCell(2).getStringCellValue();
				String CITY=row.getCell(3).getStringCellValue();
				String STATE_PROVINCE=row.getCell(4).getStringCellValue();
				String COUNTRY_ID=row.getCell(5).getStringCellValue();
				
				
				Employee emp = new Employee();
				emp.setLOCATION_ID(LOCATION_ID);
				emp.setSTREET_ADDRESS(STREET_ADDRESS);
				emp.setPOSTAL_CODE(POSTAL_CODE);
				emp.setCITY(CITY);
				emp.setSTATE_PROVINCE(STATE_PROVINCE);
				emp.setCOUNTRY_ID(COUNTRY_ID);
				repo.save(emp);
				
			}
			workbook.close();
			fis.close();
		
			System.out.println("Done!!");
		} 
		
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	
		
		/*
			String data = "C:\\Users\\Sreenivas Bandaru\\Downloads\\Eidiko\\locations.xlsx";
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(data));
				br.readLine();
				while((line=br.readLine())!=null)
				{
					String[] str =line.split(",");
					System.out.println(str);
					System.out.println(str.length);
					
					Employee emp = new Employee();
					emp.setLOCATION_ID(str[0]);
					emp.setSTREET_ADDRESS(str[1]);
					emp.setPOSTAL_CODE(str[2]);
					emp.setCITY(str[3]);
					emp.setSTATE_PROVINCE(str[4]);
					emp.setCOUNTRY_ID(str[4]);
					repo.save(emp);
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  */
	}

}
