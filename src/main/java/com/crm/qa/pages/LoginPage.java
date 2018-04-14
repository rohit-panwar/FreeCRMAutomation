package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	// PageFactory - Object Reposidary
	@FindBy(name="username")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	//@FindBy(xpath="//input[@value='Login']")
	@FindBy(xpath=".//*[@id='loginForm']/div/div/input")
	WebElement btnLogin;
	
	@FindBy(linkText="Sign Up")
	WebElement lnkSignUp;
	
	//@FindBy(xpath="//img[contains(@class='img-responsive')]")
	@FindBy(xpath="html/body/div[2]/div/div[1]/a/img")
	WebElement imgCrmLogo;
	
	// Actions
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCrmImage() {
		return imgCrmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		txtUserName.sendKeys(un);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
		System.out.println("******** Login Successful ****************");
		return new HomePage();
	}
}
