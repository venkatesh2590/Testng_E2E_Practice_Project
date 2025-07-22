package TestFiles;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTset.BaseTest;

public class OrmMyInfoTest extends BaseTest{
	
	
	
	@BeforeClass
	public void doSetUp() {
		ohpage=opage.doLogin(p.getProperty("userName"), p.getProperty("password"));
		
	}
	
	@Test
	public void doselectmyinfoLinkTest() {
		myInfoPage.doSelectMyInfoLink();
	}
	
	@DataProvider
	public Object[][] getUserdata() {
		return new Object[][] {
			{"venkat","nai","ven"},
			{"venkatesh","naidu","ven"},
			{"naidu","venk","venkatee"},
			
		};
	}
	
	@Test(dataProvider = "getUserdata")
	public void doEnterEmployedetailsTest(String firNme, String mdlNme, String lstNme) {
		myInfoPage.doEnterEemployeDetails(firNme, mdlNme, lstNme);
	}
	
}


