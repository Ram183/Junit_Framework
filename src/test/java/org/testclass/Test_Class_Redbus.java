package org.testclass;

import java.util.Date;

import org.baseclass.Base_Class;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.objectclass.Object_Class_Redbus;

public class Test_Class_Redbus extends Base_Class {

	@BeforeClass
	public static void launchBrowser() {

		chromeBrowser("https://www.redbus.in/");

		maximize();

		implictWait();

	}

	@AfterClass
	public static void closeBrowser() {

		driver.quit();
	}

	@Before
	public void starting() {

		Date d = new Date();
		System.out.println("Staring Time of Process" + d);
	}

	@After
	public void ending() {

		Date d = new Date();
		System.out.println("Staring Time of Process" + d);

	}

	@Test
	public void tc1() throws Exception {

		Object_Class_Redbus ob = new Object_Class_Redbus();

		mousehOver(ob.getSignIn());

		clickButton(ob.getSignIn());

		clickButton(ob.getSigiInLogin());

		iFrameTask(ob.getiFrame());

		sendKeys(ob.getUserName(), excelCode(15, 0));

		getAttribute(ob.getUserName());

		Thread.sleep(100000);

		clickButton(ob.getGenerateOTP());
		
		Thread.sleep(3000);
		
		takeScreenShot("C:\\Users\\Ram\\eclipse-workspace\\Junit_Framework\\ScreenShot\\redbusnap.png");

	}

}
