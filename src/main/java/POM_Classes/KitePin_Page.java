package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin_Page {
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continuebutton;

	public KitePin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterpin(String Pin)
	{
		pin.sendKeys(Pin);
	}
	public void Clickoncontinuebutton()
	{
		continuebutton.click();
	}
}
