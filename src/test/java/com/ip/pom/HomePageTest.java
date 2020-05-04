package com.ip.pom;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ip.basetest.BaseTest;
import com.ip.pages.LandingPage;
import com.ip.pages.LoginPage;

public class HomePageTest extends BaseTest {
	public static Logger log=LogManager.getLogger(BaseTest.class.getName());
	
	@BeforeTest
	public void homePageNavigation() throws IOException  {
		driver=initializeDriver();
		log.info("navigated to homepage");
		}
	
@Test(dataProvider="getData")
	public void homePageLogin(String userEmailId,String passWord) throws IOException {
		
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
	    l.getLogin().click();
		LoginPage drl=new LoginPage(driver);
		drl.getuserEmail().sendKeys(userEmailId);
		drl.getpassword().sendKeys(passWord);
		drl.getloginButton().click();
		
		
	}
@DataProvider
public Object[][] getData()
{
//rows for different set of data,column for values in one data set
	Object[][] data=new Object[2][2];
	data[0][0]="crsdash@gmail.com";
	data[0][1]="password";
	
	data[1][0]="crsh@gmail.com";
	data[1][1]="password";
	
	return data;
}

@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
}

