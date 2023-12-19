package com.eidiko.niranjana.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
			@RequestMapping("/excelData")
			public void DataInsertIntoExcel()
			{					
				service.insertExcelToDB();
			}
}
