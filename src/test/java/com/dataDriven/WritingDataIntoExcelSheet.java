package com.dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcelSheet {

	public static void main(String[] args) throws IOException {
		//excel file=workbook-sheet=row-cell
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\WINDOWS 10\\eclipse\\SeleniumProject\\testdata\\myfile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet =workbook.createSheet("data");//data is sheet name we can give anything
        
        XSSFRow row1 =sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue(123);
		row1.createCell(2).setCellValue("automation");
		
		XSSFRow row2 =sheet.createRow(1);
		row2.createCell(0).setCellValue("python");
		row2.createCell(1).setCellValue(90);
		row2.createCell(2).setCellValue("machine learning");
			
		XSSFRow row3 =sheet.createRow(2);
		row3.createCell(0).setCellValue("c#");
		row3.createCell(1).setCellValue(5);
		row3.createCell(2).setCellValue("learning");
		
		workbook.write(file);
		workbook.close();
		file.close();
	}

}
