package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactPage {
	
	@FindBy(name="title")
	WebElement title;
	
	@FindBy(name="first_name")
	WebElement first_name; 
	
	@FindBy(name="surname")
	WebElement LastName;
	
	@FindBy(name="suffix")
	WebElement suffix; 
	
	@FindBy(name="image_file")
	WebElement image_file;
	
	
	

}
