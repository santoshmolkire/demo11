package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practise {
	
	public static Object[][] convertTwodimArray() throws InvalidFormatException, IOException {
		List<UserTest> listOfScenarios=getTestData();
		Object[][] objs = new Object[listOfScenarios.size()][3];
		for(int i=0;i<listOfScenarios.size();i++) {
			UserTest testData = listOfScenarios.get(i);
			objs[i][0]=testData.getUserName().equals("NA") ? "" : testData.getUserName();
			objs[i][1]=testData.getPassword().equals("NA") ? "" : testData.getPassword();
			objs[i][2]=testData.getExpectedMsg();
		}
		
		return objs;
	}

	public static List<UserTest> getTestData()throws InvalidFormatException, IOException {

		File file=new File("C:\\Users\\Santosh Molkire\\Desktop\\userTestData.xlsx");
		XSSFWorkbook woorkbook=new XSSFWorkbook();
		XSSFSheet sheet=woorkbook.getSheet("data");
		Iterator<Row> row=	sheet.rowIterator();
		List<UserTest> listOfScenarios=new ArrayList<UserTest>();
		boolean isHeader = true;
		UserTest obj=null;
		while(row.hasNext()) {
			row.next();
			obj=new UserTest();
			if(isHeader){
				isHeader=false;
				continue;
			}
			Iterator<Cell> cells = ((Row) row).cellIterator();
			int count =0;
			while(cells.hasNext()){
				Cell cell = cells.next();
				if(count==0)
				obj.setUserName(cell.getStringCellValue());
				if(count==1)
					obj.setPassword(cell.getStringCellValue());
				if(count==2)
					obj.setExpectedMsg(cell.getStringCellValue());
				count++;
		}
		listOfScenarios.add(obj);
		}
		return listOfScenarios;
	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		getTestData();

	}

}
class UserTest{
	private String userName;
	private String password;
	private String expectedMsg;
	public UserTest() {
		super();
	}
	
	public UserTest(String userName, String password, String expectedMsg) {
		super();
		this.userName = userName;
		this.password = password;
		this.expectedMsg = expectedMsg;
	}
	
	@Override
	public String toString() {
		return "UserTest [userName=" + userName + ", password=" + password + ", expectedMsg=" + expectedMsg + "]";
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getExpectedMsg() {
		return expectedMsg;
	}
	public void setExpectedMsg(String expectedMsg) {
		this.expectedMsg = expectedMsg;
	}
	
}