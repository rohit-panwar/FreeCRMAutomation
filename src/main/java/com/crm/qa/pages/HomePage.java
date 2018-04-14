package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'User: Roh Singh')]")
	WebElement lblUserName;
	
	@FindBy(linkText="Contacts")
	WebElement lnkContacts;
	
	@FindBy(linkText="Deals")
	WebElement lnkDeals;
	
	@FindBy(linkText="Tasks")
	WebElement lnkTasks;
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink() {
		lnkContacts.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		lnkDeals.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		lnkDeals.click();
		return new TasksPage();
	}
	
	public boolean validateUserName() {
		return lblUserName.isDisplayed();
	}
}
