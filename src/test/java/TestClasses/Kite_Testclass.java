package TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM_Classes.KiteHome_page;
import POM_Classes.KiteLogIn_Page;
import POM_Classes.KitePin_Page;
import PackageBase.BaseClass;
import PackageUtility.UtilityClass;
@Listeners(PackListeners.ListenerClass.class)
public class Kite_Testclass extends BaseClass {
	KiteLogIn_Page login;
	KitePin_Page Pin;
	KiteHome_page home;
	@BeforeClass
	public void browserLuanching() throws IOException
	{
		launchingBrowser();
		login=new KiteLogIn_Page(driver);
		Pin=new KitePin_Page(driver);
		home=new KiteHome_page(driver);
		}
	@BeforeMethod
	public void logintoApp() throws IOException
	{
		login.enteruserID(UtilityClass.getDatafromPropertyFile("UN"));
		login.enterpassword(UtilityClass.getDatafromPropertyFile("PWD"));
		login.ClickloginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Pin.enterpin(UtilityClass.getDatafromPropertyFile("PIN"));
		Pin.Clickoncontinuebutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        Reporter.log("Login to App",true);
		
	}
  @Test
  public void validateUserID() throws IOException 
  {
	  String AtualUserId = home.getUserId();
	  String ExpectedUserId = UtilityClass.getDatafromPropertyFile("UN");
	  Assert.fail();
	  Assert.assertEquals(AtualUserId, ExpectedUserId,"UserId is not matching test case is Failed");
	  Reporter.log("Validated userId",true);
	  
//	  UtilityClass.takeScreenshots(driver, 203);
//	  Reporter.log("TakeScreenshot",true);
  
  }
  
  @AfterMethod
  public void LogOutfromApp()
  {
	  home.clicklogoutbutton();
  }
  @AfterClass
  public void Browserclosing()
  {
	  closingBrowser();
  }
}
