package com.eidiko.niranjana.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsertTestOracle {
	  private static final String  DATE_INSERT_QUERY="INSERT INTO EMPLOYEE VALUES(EMPLOYEES_SEQ.NEXTVAL,?,?,?,?)";
		public static void main(String[] args) {
			 Scanner sc=null;
			 String ename=null,edob=null,edoj=null,edor=null;
			 Connection con=null;
			 PreparedStatement ps=null;
			 java.util.Date udob=null,udoj=null,udor=null;
			// String udob=null,udom=null;
			 SimpleDateFormat sdf1=null,sdf2=null;
			// java.sql.Date sqdob=null,sqdom=null,sqdoj=null;
		//	String sqdob=null,sqdom=null,sqdoj=null;
			 int count=0;
			try {
				//read inputs
				sc=new Scanner(System.in);
				if(sc!=null) {
					 System.out.println("Enter person name::");
					ename=sc.next();
					 
					 System.out.println("Enter person DOB(dd-MM-yyyy)::");
					 edob=sc.next();
					 System.out.println("Enter person DOM(MM-dd-yyyy)::");
					 edoj=sc.next();
					 System.out.println("Enter person DOJ(yyyy-MM-dd)::");
					 edor=sc.next();
				}//if
				// converting String Date values to java.util.Date class objs (dob,dom)
				 sdf1=new SimpleDateFormat("dd-MM-yyyy");
				  if(sdf1!=null) 
				    udob=sdf1.parse(edob);
				  
				 sdf2=new SimpleDateFormat("dd-MM-yyyy");
				  if(sdf2!=null)
				    udoj=sdf2.parse(edoj);
				  sdf2=new SimpleDateFormat("dd-MM-yyyy");
				  if(sdf2!=null)
				    udor=sdf2.parse(edor);

				  //establish the connection
				   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				   //create PreparedStatement object
				   if(con!=null)
					   ps=con.prepareStatement(DATE_INSERT_QUERY);
				   //set values to query params
				   if(ps!=null) {
					   ps.setString(1,ename);
					 
					   ps.setString(2, edob);
					   ps.setString(3, edoj);
					   ps.setString(4, edor);
				   }
				   
				   //execut the SQL query
				   if(ps!=null)
					    count=ps.executeUpdate();
				   //process the Result
				   if(count==0)
					    System.out.println("Record not inserted");
				   else
					   System.out.println("record inserted");
			}//try
			catch(SQLException se) {
				se.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				//close jdbc objs
				try {
					if(ps!=null)
						ps.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
				try {
					if(con!=null)
						con.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
				try {
					if(sc!=null)
						sc.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}//finally
			}//main
	}//class
