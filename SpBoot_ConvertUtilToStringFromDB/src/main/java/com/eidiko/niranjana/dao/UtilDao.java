package com.eidiko.niranjana.dao;

import java.util.List;
import java.util.Map;

import com.eidiko.niranjana.entity.StringToUtil;

public interface UtilDao {
	public String Insertdata(StringToUtil employee);
	
	public List<Map<String,Object>> fetchData();

	public List<Map<String, Object>> getEmployeesByJoiningDate(String joiningDate);

}
