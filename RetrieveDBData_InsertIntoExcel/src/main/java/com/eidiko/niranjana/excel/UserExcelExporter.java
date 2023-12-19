package com.eidiko.niranjana.excel;			//Request happend from Browser client:- http://localhost:2020/databaseData

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.eidiko.niranjana.entity.Employee;

public class UserExcelExporter {
	private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<Employee> retrieveAllData;

	public UserExcelExporter( List<Employee> retrieveAllData) {		
		this.retrieveAllData = retrieveAllData;
		workbook = new XSSFWorkbook();
	}
	
	private void createCell(Row row, int columnCount, Object value, CellStyle style) {
		sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);		
	}
	
	private void writeHeaderRowInExcel() {
        sheet = workbook.createSheet("Users");       
        Row row = sheet.createRow(0);       
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
        createCell(row, 0, "User ID", style);  
        createCell(row, 1, "CITY", style);
        createCell(row, 2, "COUNTRY_ID", style);
        createCell(row, 3, "LOCATION_ID", style);    
        createCell(row, 4, "POSTAL_CODE", style);    
        createCell(row, 5, "STATE_PROVINCE", style);  
        createCell(row, 6, "STREET_ADDRESS", style);
    }
	 private void writeHeaderColumnDataInExcel() {
	        int rowCount = 1;	 
	        CellStyle style = workbook.createCellStyle();
	        XSSFFont font = workbook.createFont();
	        font.setFontHeight(14);
	        style.setFont(font);	                 
	        for (Employee emp : retrieveAllData) {
	            Row row = sheet.createRow(rowCount++);
	            int columnCount = 0;	             
	            createCell(row, columnCount++, emp.getId(), style);
	            createCell(row, columnCount++, emp.getCITY(), style);
	            createCell(row, columnCount++, emp.getCOUNTRY_ID(), style);
	            createCell(row, columnCount++, emp.getLOCATION_ID(), style);	            
	            createCell(row, columnCount++, emp.getPOSTAL_CODE(), style);            
	            createCell(row, columnCount++, emp.getSTATE_PROVINCE(), style);
	            createCell(row, columnCount++, emp.getSTREET_ADDRESS(), style);	                   
	        }
	    }
	public void export(HttpServletResponse response) throws IOException {
	        writeHeaderRowInExcel();
	        writeHeaderColumnDataInExcel();	         
	        ServletOutputStream outputStream = response.getOutputStream();
	        workbook.write(outputStream);
	        workbook.close();	         
	        outputStream.close();	         
	    }	
}
