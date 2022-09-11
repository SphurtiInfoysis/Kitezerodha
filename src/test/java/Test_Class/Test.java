package Test_Class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ActPomClass.Home;
import ActPomClass.Pom1;
import Base_Class.Base;
import Utility_Class.Utlity;

public class Test extends Base {
	//declare all useful members as global
	Pom1 p1;
	Home h1;
	
	@BeforeClass
	public void OpenBrowser() throws Throwable{
		openBrowser();
		
		 //all objects of POM class
		
		p1=new Pom1(driver);
		h1=new Home(driver);
		
	}
	
	@BeforeMethod
	
	public void loginToApp() throws Throwable {
		
		//enter un
		
		p1.enterUN(Utlity.getTD(0, 0));
		
		//enter pwd
		
		p1.enterPWD(Utlity.getTD(0, 1));
		
		//click login
		p1.clicklogin();
	}
	
	@org.testng.annotations.Test
	public void verifyUID() throws Throwable {
		Reporter.log("running verifyID",true);
		String actID = h1.verifyUID();
		String expId=Utlity.getTD(0, 0);
		Assert.assertEquals(actID, expId,"both are diffrent tc id fail");
	}
	
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout application",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close browser",true);
	}
	
	
	

}
