package com.GenericUtilitys;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	/**
	 * @author Suresh Biswal
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromExcel(String sheet,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
	  Workbook wb=WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheet);
	 String data=sh.getRow(row).getCell(cell).getStringCellValue();
	 return data;
	
	}
	
	/**
	 * 
	 * @param sheet
	 * @return
	 * @throws Throwable
	 */
	public int  getLastRowNo(String sheet) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
		  Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheet);
		 int LastRow=sh.getLastRowNum();
		 return LastRow;
	}
	
	
	/**
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 * @throws Throwable
	 * @throws Throwable
	 */
	public void writeDataInExcel(String sheet,int row,int cell,String value) throws Throwable, Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
		  Workbook wb=WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheet);
		  sh.createRow(row).createCell(cell).setCellValue(value);
		  FileOutputStream fos=new FileOutputStream(IpathConstants.ExcelPath);
		  wb.write(fos);
		  
	}
	
	
	/**
	 * 
	 * @param sheet
	 * @return
	 * @throws Throwable
	 */
	public HashMap<String, String > readMultipleDataInExcel(String sheet) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
		  Workbook wb=WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheet);
		  int count=sh.getLastRowNum();
		  HashMap<String, String> map=new HashMap<String, String>();
		  for(int i=0;i<=count;i++)
		  {
			 String key= sh.getRow(i).getCell(0).getStringCellValue();
			  String value=sh.getRow(i).getCell(1).getStringCellValue();
			  map.put(key, value);
			  
		  }
		  return map;
	}
	
}
