package com.eidiko.niranjana.controller;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.Employee;
import com.eidiko.niranjana.excel.UserExcelExporter;
import com.eidiko.niranjana.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
			@GetMapping("/databaseData")
			public void DataInsertIntoExcel(HttpServletResponse response) throws IOException
			{					
				response.setContentType("application/octet-stream");
		        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		        String currentDateTime = dateFormatter.format(new Date());
		         
		        String headerKey = "Content-Disposition";
		        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
		        response.setHeader(headerKey, headerValue);
		        
				List<Employee> retrieveAllData = service.retrieveAllData();
				UserExcelExporter excelExporter = new UserExcelExporter(retrieveAllData);
		         
		        excelExporter.export(response);   
			}
}
