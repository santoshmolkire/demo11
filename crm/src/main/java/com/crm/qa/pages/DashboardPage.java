package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.utility.Apputil;

public class DashboardPage extends  Apputil {

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newcontactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	
	
	public Contactspage clickoncontactsLink() {
		contactsLink.click();
		return new Contactspage();
	}
	
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newcontactsLink.click();
		
	}
	
	
	public TasksPage clickOnTasksLink(){
		taskLink.click();
		return new TasksPage();
	}
	
	
	
	
	
	
	
	
}
