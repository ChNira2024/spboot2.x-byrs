package com.eidiko.niranjana.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.entity.Employee;
import com.eidiko.niranjana.repo.IEmployeeRepo;
import com.eidiko.niranjana.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepo repo;
	String line="";
	@Override
	public List<Employee> retrieveAllData() {
		
		return repo.findAll();
	
	
//		//Excel
//				XSSFWorkbook workbook=new XSSFWorkbook();
//				XSSFSheet sheet=workbook.createSheet("Locations Data");
//				
//				XSSFRow row=sheet.createRow(0);
//				row.createCell(0).setCellValue("LOCATION_ID");
//				row.createCell(1).setCellValue("STREET_ADDRESS");
//				row.createCell(2).setCellValue("POSTAL_CODE");
//				row.createCell(3).setCellValue("CITY");
//				row.createCell(4).setCellValue("STATE_PROVINCE");
//				row.createCell(5).setCellValue("COUNTRY_ID");
//				
//				int r=1;
//				while(listEmployee.next())
//				{
//					double locId=listEmployee.getDouble("LOCATION_ID");
//					String streatAdd=rs.getString("STREET_ADDRESS");
//					String postalCode=rs.getString("POSTAL_CODE");
//					String city=rs.getString("CITY");
//					String stateProv=rs.getString("STATE_PROVINCE");
//					String countryId=rs.getString("COUNTRY_ID");
//					
//					row=sheet.createRow(r++);
//					
//					row.createCell(0).setCellValue(locId);
//					row.createCell(1).setCellValue(streatAdd);
//					row.createCell(2).setCellValue(postalCode);
//					row.createCell(3).setCellValue(city);
//					row.createCell(4).setCellValue(stateProv);
//					row.createCell(5).setCellValue(countryId);
//					
//				}
//				FileOutputStream fos=new FileOutputStream("C:\\Users\\Sreenivas Bandaru\\Downloads\\Eidiko\\locations2.xlsx");
//				workbook.write(fos);
//				workbook.close();
//				fos.close();
			//	System.out.println("Done!!!");
	}

}
