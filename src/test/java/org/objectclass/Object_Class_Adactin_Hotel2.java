package org.objectclass;


import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Adactin_Hotel2 extends Base_Class {

	public Object_Class_Adactin_Hotel2() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	@FindBy(id = "continue")
	private WebElement continueButton;

}
