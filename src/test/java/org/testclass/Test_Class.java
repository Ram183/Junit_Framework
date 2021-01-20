package org.testclass;

import java.util.Date;

import org.baseclass.Base_Class;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.objectclass.Object_Class;

public class Test_Class extends Base_Class{

	@BeforeClass
	public static void launchBrowser() {

		chromeBrowser("https://www.facebook.com/");
		
		maximize();
		
		implictWait();
	}
	
	@AfterClass
	public static void endBrowser() {

		driver.quit();
	}
	
	@Before
	public void startProcessing() {
		
		Date d = new Date();
		System.out.println("Process Starting Time" + d);
	}
	
	@After
	public void endProcessing() {

		Date d = new Date();
		System.out.println("Process ending Time" + d);
	}
	
	@Test
	public void tc1() throws Exception {
		
		Object_Class ob = new Object_Class();
		
		sendKeys(ob.getUserName(), excelCode(1, 0));
		
		sendKeys(ob.getPassword(), excelCode(1, 1));
		
		clickButton(ob.getLogin());
		
		Thread.sleep(5000);
		
		excelWrite2(1, 2, getText1(ob.getLoginMessage()));
		
		getText1(ob.getLoginMessage());
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\Junit_Framework\\ScreenShot\\facebook.png");
		
		

	}
}
