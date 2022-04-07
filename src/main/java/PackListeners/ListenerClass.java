package PackListeners;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import PackageBase.BaseClass;

public class ListenerClass extends BaseClass  implements ITestListener
{
	public void onTestFailure(ITestResult result) {
		String Screen2 = result.getName();
		 System.out.println("test case is failed"+result.getName());
		try {
			takeScreenshots(Screen2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("test Case is passed"+result.getName());
	}
	}

