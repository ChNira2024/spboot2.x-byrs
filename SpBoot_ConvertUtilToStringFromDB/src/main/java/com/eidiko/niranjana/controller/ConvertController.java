package com.eidiko.niranjana.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.dao.UtilDao;
import com.eidiko.niranjana.entity.StringToUtil;

@RestController
public class ConvertController 
{
	@Autowired
	private UtilDao dao;

	@PostMapping("/convertStringToUtil")//insert string data to Date column
	public String ConvertStringToUtil(@RequestBody StringToUtil employee )
	{
		try
		{
			return dao.Insertdata(employee);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "data not inserted";
		}
	}
	
	@GetMapping("/employees")
    public List<Map<String, Object>> getAllEmployeesData() 
	{
        return dao.fetchData();
    }
	
	@GetMapping("/employeesByJoiningDate")
    public List<Map<String, Object>> getEmployeesByJoiningDate(@RequestParam String joiningDate) {
        return dao.getEmployeesByJoiningDate(joiningDate);
    }
}
