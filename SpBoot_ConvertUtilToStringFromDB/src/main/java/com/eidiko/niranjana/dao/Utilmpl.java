package com.eidiko.niranjana.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.eidiko.niranjana.entity.StringToUtil;
@Repository
public class Utilmpl implements UtilDao 
{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public String Insertdata(StringToUtil employee) 
	{
		String query="INSERT INTO EMPLOYEE(EID,ENAME,EDOB,EDOJ,EDOR) VALUES(?,?,TO_DATE(?,'YYYY-MM-DD'),?,?)";
		int count=0;

        try 
        {
            
        	//SQL query to use the TO_DATE function to explicitly convert the date strings to Oracle Date.
        	jdbcTemplate.update(query, employee.getEid(), employee.getEname(), employee.getEdob(), employee.getEdoj(), employee.getEdor());
        	
        	//firstway::Use java.sql.Date.valueOf() method for convert String to Date,sending from postman and insert into Database(Working fine)
              //count = jdbcTemplate.update(query,employee.getEid(),employee.getEname(),employee.getEdob(),java.sql.Date.valueOf(employee.getEdoj()),java.sql.Date.valueOf(employee.getEdor()));
        
        	//2nd way::Use PreparedStatementSetter:method for convert String to Date,sending from postman and insert into Database(Working fine)
            jdbcTemplate.update(query, new PreparedStatementSetter() {
											                @Override
											                public void setValues(PreparedStatement preparedStatement) throws SQLException 
											                {
											                    preparedStatement.setInt(1, employee.getEid());
											                    preparedStatement.setString(2, employee.getEname());
											                    preparedStatement.setString(3, employee.getEdob());
											                    preparedStatement.setDate(4, Date.valueOf(employee.getEdoj()));
											                    preparedStatement.setDate(5, Date.valueOf(employee.getEdor()));
											                }});
            return "inserted";
		
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return "data not insert"+e.getMessage();
        }	
	}
	
	@Override
	public List<Map<String,Object>> fetchData() 
	{
		String query="SELECT EID,ENAME,EDOB,EDOJ,EDOR FROM EMPLOYEE";
		
		List<Map<String, Object>> employees = jdbcTemplate.queryForList(query);
		return employees;
	}

	@Override
	public List<Map<String, Object>> getEmployeesByJoiningDate(String joiningDate) 
	{
	        String query = "SELECT EID, ENAME, EDOB, EDOJ, EDOR FROM EMPLOYEE WHERE EDOJ = ?";
	        
	        List<Map<String, Object>> employees = jdbcTemplate.queryForList(query, joiningDate);
	        
	        return employees;
	}
	
	
	

}
//CREATE TABLE EMPLOYEE(EID NUMBER,ENAME VARCHAR2(30),EDOB VARCHAR2(30),EDOJ DATE,EDOR DATE);
