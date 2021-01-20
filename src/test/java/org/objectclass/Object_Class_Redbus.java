package org.objectclass;

import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Redbus extends Base_Class {

	public Object_Class_Redbus() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "signin-block")
	private WebElement signIn;

	@FindBy(id = "signInLink")
	private WebElement sigiInLogin;

	@FindBy(xpath = "//iframe[@class='modalIframe']")
	private WebElement iFrame;

	@FindBy(id = "mobileNoInp")
	private WebElement userName;

	@FindBy(xpath = "(//div[@class='recaptcha-checkbox-checkmark'])[1]")
	private WebElement checkBox;

	@FindBy(id = "otp-container")
	private WebElement generateOTP;

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getSigiInLogin() {
		return sigiInLogin;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getGenerateOTP() {
		return generateOTP;
	}

	public WebElement getiFrame() {
		return iFrame;
	}

}
