package com.crm.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Santosh Molkire\\Desktop\\HalfEbayTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("RegTestData");
		
		Iterator<Row> row=sheet.iterator();
		while(row.hasNext()) {
			Row rowValue=row.next();
			Iterator<Cell> cell=rowValue.cellIterator();
			while(cell.hasNext()) {
				Cell cellValue= cell.next();
				String value=cellValue.getStringCellValue();
				System.out.println("  " +value);
			}
		}
		System.out.println( );
		/*int rowCount=sheet.getLastRowNum();
		
		int cellCount=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowCount;i++) {
			
			
					XSSFRow currentRow=sheet.getRow(i);
					
					
			for(int j=0;j<cellCount;j++) {
		String cell=currentRow.getCell(j).getStringCellValue();
				System.out.println(cell);
			}
		}*/
	
	}

}
