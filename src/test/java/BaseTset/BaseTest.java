package BaseTset;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import DriverFactory.DriverFactory;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.OrmHomePage;
import Pages.OrmLeavePage;
import Pages.OrmLoginPage;
import Utils.OrmMyInfoPage;

public class BaseTest {
	
	public DriverFactory df;
	public WebDriver driver;
	public LoginPage login;
	public HomePage home;
	public Properties p;
	public OrmLoginPage opage;
	public OrmHomePage ohpage;
	public OrmLeavePage lpage;
	public OrmMyInfoPage myInfoPage;
	
	
	
	@BeforeTest
	public void setUp() throws IOException {
		 df = new DriverFactory();
	   	 p= df.getProperties();
		 driver=df.initilizeBrowser();
		 driver.get(p.getProperty("url"));
		 login = new LoginPage(driver);
		 home = new HomePage(driver);
		 opage = new OrmLoginPage(driver);
		 lpage = new OrmLeavePage(driver);
		 myInfoPage = new OrmMyInfoPage(driver);
		 
		 
		 
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
