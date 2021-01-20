package org.testclass;

import java.util.Date;

import org.baseclass.Base_Class;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.objectclass.object_Class_Flipkart;

public class Test_Class_Flipkart extends Base_Class {

	@BeforeClass
	public static void launch() {

		chromeBrowser("https://www.flipkart.com/account/login");

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
	
		object_Class_Flipkart o = new object_Class_Flipkart();
		
		sendKeys(o.getEmailId(), excelCode(18, 0));
		
		sendKeys(o.getPassword(), excelCode(18, 1));
		
		clickButton(o.getLogin());
		
		Thread.sleep(3000);
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\Junit_Framework\\ScreenShot\\flipkart.png");
	
	}
}
