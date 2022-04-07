package GoIbiboPOM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GoIbiboMyProfile {
	@FindBy(xpath="//span[@class='arrow-icon gr-append-bottom3 down']") private WebElement ProfileArrow;
	@FindBy(xpath="//span[text()='View your profile']") private WebElement Profile;
    @FindBy(xpath="//input[@type='number']") private WebElement MobNo;
    @FindBy(xpath="(//input[@type='text'])[1]") private WebElement Email;
    @FindBy(xpath="(//input[@type='text'])[2]") private WebElement FirstN;
    @FindBy(xpath="(//input[@type='text'])[3]") private WebElement LastN;
    @FindBy(id="female")  private WebElement Gender;
    @FindBy(xpath="//div[@id='root']//div[@class='DayPicker-Body']/div[2]/div[text()='7']")private WebElement Date;
    @FindBy(xpath="//select[@name='month']") private WebElement Month;
    @FindBy(xpath="//select[@name='year']") private WebElement Year;
  
    public GoIbiboMyProfile(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickProfileArrow() 
    {
    	ProfileArrow.click();
    }
    public void clickProfile()
    {
    	Profile.click();
    }
    public void enterMobNo(String Mob)
    {
    	MobNo.sendKeys(Mob);
    }
    public void enterEmail(String mail)
    {
    	MobNo.sendKeys(mail);
    }
    public void enterFirstN(String FN)
    {
    	MobNo.sendKeys(FN);
    }
    public void enterLastN(String LN)
    {
    	MobNo.sendKeys(LN);
    }
    public void selectGender()
    {
    	Gender.click();
    }
    public void selectYear()
    {
    	Select s1=new Select(Year);
        s1.selectByValue("1996");
    }
    
    public void selectMonth()
    {
    	Select s=new Select(Month);
    	s.selectByVisibleText("May");
    }
    public void selectDate()
    {
    	Date.getText();
    	Date.click();
    }
}
