package org.objectclass;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class extends Base_Class{
	
	public Object_Class() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='u_0_b']")
	private WebElement login;
	
	@FindBy(xpath="//div[@class='_9ay7']")
	private WebElement loginMessage;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLoginMessage() {
		return loginMessage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}