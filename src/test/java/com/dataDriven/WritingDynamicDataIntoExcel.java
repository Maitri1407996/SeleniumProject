package com.dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C:\\Users\\WINDOWS 10\\eclipse\\SeleniumProject\\testdata\\myfile_dynamic.xlsx.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet =workbook.createSheet("dynamicData");//data is sheet name we can give anything
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter row number:");
        int numberofRow = sc.nextInt();
        
        System.out.println("enter number of cells");
        int numbercell = sc.nextInt();
        for(int r = 0 ;r<=numberofRow;r++)
        {
        	XSSFRow currentrow = sheet.createRow(r);
        	for(int c = 0 ;c<numbercell;c++)
        	{
        		XSSFCell cell = currentrow.createCell(c);
        		cell.setCellValue(sc.next());
        		
        	}
        }
        
        workbook.write(file);
        workbook.close();
        file.close();
        
	}

}
