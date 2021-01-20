package org.testclass;

import java.util.Date;

import org.baseclass.Base_Class;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.objectclass.Object_Class_Adactin_Hotel;
import org.objectclass.Object_Class_Adactin_Hotel1;
import org.objectclass.Object_Class_Adactin_Hotel2;
import org.objectclass.Object_Class_Adactin_Hotel3;

public class Test_Class_Adactin_Hotel extends Base_Class {

	@BeforeClass
	public static void launch() {

		chromeBrowser("http://www.adactin.com/HotelApp/");

		maximize();

		implictWait();

	}

	@AfterClass
	public static void closeWindow() {

		driver.quit();
	}

	@Before
	public void programStartingTime() {

		Date d = new Date();
		System.out.println("Program Starts at: " + d);
	}

	@After
	public void programEndTime() {

		Date d = new Date();
		System.out.println("Program End at: " + d);
	}

	@Test
	public void tc1() throws Exception {
		
		Object_Class_Adactin_Hotel ob = new Object_Class_Adactin_Hotel();
		
		sendKeys(ob.getUserName(), excelCode(10, 0));

		sendKeys(ob.getPassword(), excelCode(10, 1));

		clickButton(ob.getLogin());	
	}
	
	@Test
	public void tc2() throws Exception {

		Object_Class_Adactin_Hotel1 ob1 = new Object_Class_Adactin_Hotel1();
		
		getAttribute(ob1.getWelcomeNotes());

		selectOptions(ob1.getLocation(), excelCode(10, 2));

		selectOptions(ob1.getHotels(), excelCode(10, 3));

		selectOptions(ob1.getRoomType(), excelCode(10, 4));

		selectOptions(ob1.getNumberOfRooms(), excelCode(10, 5));

		selectOptions(ob1.getAdultsPerRoom(), excelCode(10, 6));

		selectOptions(ob1.getChildrenPerRoom(), excelCode(10, 7));

		clickButton(ob1.getSearchButton());
		
	}
	
	@Test
	public void tc3() {

		Object_Class_Adactin_Hotel2 ob2 = new Object_Class_Adactin_Hotel2();
		
		clickButton(ob2.getRadioButton());

		clickButton(ob2.getContinueButton());
	
	}
	
	@Test
	public void tc4() throws Exception {

		Object_Class_Adactin_Hotel3 ob3 = new Object_Class_Adactin_Hotel3();
		
		sendKeys(ob3.getFirstName(), excelCode(10, 8));

		sendKeys(ob3.getLastName(), excelCode(10, 9));

		sendKeys(ob3.getAddress(), excelCode(10, 10));

		sendKeys(ob3.getCreditCardNo(), excelCode(10, 11));

		selectOptions(ob3.getCreditCardType(), excelCode(10, 12));

		selectOptions(ob3.getSelectMonth(), excelCode(10, 13));

		selectOptions(ob3.getSelectYear(), excelCode(10, 14));

		sendKeys(ob3.getcVV(), excelCode(10, 15));

		clickButton(ob3.getBookNow());

		explicitWait("//input[@id='order_no']");
		
		excelWrite2(10, 16, getAttribute1(ob3.getOrderNo()));

		System.out.println(getAttribute1(ob3.getOrderNo()));
		
		scrollDown(ob3.getOrderNo());
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\Junit_Framework\\ScreenShot\\Adactin.png");
	}
	
}
