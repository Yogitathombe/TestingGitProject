package PackageBase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import PackageUtility.UtilityClass;

public class BaseClass
{  protected static WebDriver driver;
	public void launchingBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(UtilityClass.getDatafromPropertyFile("URL"));
		driver.manage().window().maximize();
		Reporter.log("Browser is Luanching", true);

	}
	public  void takeScreenshots(String TCName1) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Vivek\\Desktop\\Velocity\\Selenium\\Screenshot\\"+TCName1+"screen.png");
		FileHandler.copy(scr, dest);
		Reporter.log("Take Screenshot when test case is failed"+TCName1,true);
	}

	
	public void closingBrowser()
	{
		driver.close();
	}
}
