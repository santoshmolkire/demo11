package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\Santosh Molkire\\Desktop\\HalfEbayTestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		Sheet sheet=wb.getSheet("RegTestData");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		ArrayList<User> list = new ArrayList<>();
		Row row;
		row= sheet.getRow(0);
		int fname=0;int lname=0;int address=0;int city=0;
		for(int i=0;i<=3;i++) {
			String s= row.getCell(i).getStringCellValue();
			if(s.equalsIgnoreCase("firstname")) {
				fname=i;
			}else if(s.equalsIgnoreCase("lastname")) {
				lname=i;
			}else if(s.equalsIgnoreCase("adress")) {
				address=i;
			}else if(s.equalsIgnoreCase("city")) {
				city=i;
			}
		}
		for(int i=1;i<rowCount+1;i++) {
			row= sheet.getRow(i);
			list.add(new User(row.getCell(fname).getStringCellValue(), row.getCell(lname).getStringCellValue(), row.getCell(address).getStringCellValue(), row.getCell(city).getStringCellValue()));
		}
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			/*User u = (User)itr.next();
			System.out.println("Fname= "+u.getFirstname()+" LName= "+u.getLastname()+" Address= "+u.getAdress1()+" City= "+u.getCity());
		*/
		}

	}

}
