package Com.Actitime.Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Com.Actitime.pompackage.LoginPage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		Reporter.log("openbrowser",true);
		 driver=new ChromeDriver();
	}
	@AfterTest
	public void closebrowser()
	{
		Reporter.log("closebrowser",true);	
	}
	@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String URL = f.getproperty("url");
		String password = f.getproperty("password");
		String username = f.getproperty("username");
	    LoginPage L=new LoginPage(driver);
	    PageFactory.initElements(driver, L);
		L.setlogin(username, password);;
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}


}
