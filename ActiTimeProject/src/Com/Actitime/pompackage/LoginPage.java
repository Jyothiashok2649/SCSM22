package Com.Actitime.pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="//input[@id='username']")
	private WebElement untbx;
	
	@FindBy(name="//input[@name='pwd']")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	public void loginpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	public void setlogin( String un,String pw)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	

}
