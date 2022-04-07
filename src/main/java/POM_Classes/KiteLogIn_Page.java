package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIn_Page {
@FindBy(id = "userid") private WebElement userID;
@FindBy(xpath="//input[@id='password']") private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement ClickOnloginButton;

public KiteLogIn_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
 public void enteruserID(String u_id)
 {
	 userID.sendKeys(u_id);
 }
 public void enterpassword(String pwd)
 {
	 password.sendKeys(pwd);
 }
 public void ClickloginButton()
 {
	 ClickOnloginButton.click();
 }
}
