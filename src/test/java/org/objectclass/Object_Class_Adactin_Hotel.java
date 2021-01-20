package org.objectclass;


import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Adactin_Hotel extends Base_Class{

	public Object_Class_Adactin_Hotel() {

	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
