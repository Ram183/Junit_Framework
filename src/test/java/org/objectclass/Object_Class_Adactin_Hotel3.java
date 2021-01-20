package org.objectclass;


import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Adactin_Hotel3 extends Base_Class{

	public Object_Class_Adactin_Hotel3() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement creditCardNo;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement selectMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement selectYear;

	@FindBy(id = "cc_cvv")
	private WebElement cVV;

	@FindBy(id = "book_now")
	private WebElement bookNow;

	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement orderNo;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getcVV() {
		return cVV;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
}
