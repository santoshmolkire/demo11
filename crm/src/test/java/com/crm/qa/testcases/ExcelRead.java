package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		/*File file =new File("C:\\Users\\Yogesh\\Desktop\\userdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("RegTestData");
		Iterator<Row> rowIterator = sheet.rowIterator();
		User user = null;
		List<User> listOfUsers = new ArrayList<>();
		List<String> headers =new ArrayList<>();
		while(rowIterator.hasNext()){
			Row row = rowIterator.next();
			user = new User();
			if(headers.isEmpty()){
				headers = builderHeaders(row);
				continue; //skip header row
			}
			Iterator<Cell> cellIterator= row.cellIterator();
			int cellCount = 0;
			while(cellIterator.hasNext()){
				Cell cell = cellIterator.next();
				switch (headers.get(cellCount).toUpperCase()) {
				case "S.NO":
						user.setUserId((int)cell.getNumericCellValue());
						break;
				case "USERNAME":
					user.setUsername(cell.getStringCellValue())	;
					break;
				case "PASSWORD":
					user.setPasword(cell.getStringCellValue());
						break;
				case "MESSAGE":
					user.setMessage(cell.getStringCellValue());
						break;
				default:
						System.out.println("not matching header found...");
						break;
				}
				cellCount++;
			}
			listOfUsers.add(user);
		}
	
		System.out.println(listOfUsers);
		
	}

	private static List<String> builderHeaders(Row row) {
		Iterator<Cell> cellIterator = row.cellIterator();
		List<String> headers = new ArrayList<String>();
		while(cellIterator.hasNext()){
			Cell cell = cellIterator.next();
			if(cell.getCellType() == 0){
				headers.add(cell.getNumericCellValue()+"");
			}else if(cell.getCellType()== 1){
				headers.add(cell.getStringCellValue());
			}
		}
		System.out.println(headers);
		return headers;*/
		File file = new File("C:\\Users\\Santosh Molkire\\Desktop\\HalfEbayTestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		Sheet sheet=wb.getSheet("RegTestData");
		 Iterator<Row> rowitr=sheet.rowIterator();
		
		 rowitr.next();
		 ArrayList<String> al=new ArrayList<String>();
		 
		 while(rowitr.hasNext()) {
			 al.add((rowitr.next().getCell(0).getStringCellValue()));
			 
			Row row= rowitr.next();
			
			Iterator<Cell>cell=row.cellIterator();
			 while(cell.hasNext()) {
				 System.out.print(cell.next().getStringCellValue());
			 }
		 
		 System.out.println(al);
	}
	}
}
