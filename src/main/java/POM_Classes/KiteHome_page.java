package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHome_page {
@FindBy(xpath="//span[@class='user-id']") private WebElement ClickuserId;
@FindBy(xpath="//a[@target='_self']") private WebElement logoutbutton;

public KiteHome_page(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public String getUserId()
{
	String Actualuserid = ClickuserId.getText();
	return Actualuserid;
}
 public void clicklogoutbutton()
 {
	 ClickuserId.click();
	 logoutbutton.click();
 }

}
