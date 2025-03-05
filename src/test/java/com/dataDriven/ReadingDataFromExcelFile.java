package com.dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ReadingDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		//excel file=workbook-sheet=row-cell
		
		//1st open excel sheet
		
		FileInputStream file = new FileInputStream("C:\\Users\\WINDOWS 10\\eclipse\\SeleniumProject\\testdata\\Data.xlsx.xlsx");
	    //extract workbook 
		//file input stream take as argument.
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		int sheetnum=workbook.getNumberOfSheets();
		for(int i = 0;i<sheetnum;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Data.xlsx"))
			{
			XSSFSheet sheett=workbook.getSheetAt(i);
			}
		}
		
		//find out the sheet u can to look
		XSSFSheet sheet = workbook.getSheet("sheet1");//sheet name
		//another way getSheetAt(index of the sheet)
		//find the number of cell 
		//first find out  the number of rows
		int TotalRows= sheet.getLastRowNum();
		System.out.println("total row" +TotalRows);
		int totalcellineachrow =sheet.getRow(0).getLastCellNum();
		System.out.println("total cell" +totalcellineachrow);
		
		for(int r =0 ;r<=TotalRows ;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c= 0;c<totalcellineachrow ;c++)
			{
				XSSFCell currentcell =currentrow.getCell(c);
						System.out.print(currentcell.toString()+ "\t");
				
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		

	}

}
