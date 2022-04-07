package GoIbiboPOM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoBus_Page
{
	@FindBy(xpath="//p[text()='Login or Signup']") private WebElement Login;
	@FindBy(xpath="//button[text()='Login/Sign Up']") private WebElement ButtonLogin;
	@FindBy(xpath="//input[@name='phone']") private WebElement PhoneNo;
	@FindBy(xpath="//input[@type='button']") private WebElement ContinueButton;

	public GoBus_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	public void clickOnLogin()
	{
		Login.click();
	}
   public void clickOnButtonLogin()
   {
	   ButtonLogin.click();
   }
   
   public void enterPhoneNo(String no)
   {
	   PhoneNo.sendKeys(no);
   }
   public void clickContinueButton()
   {
	   ContinueButton.click();
   }
   
   
}


