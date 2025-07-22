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
			{"naidu","venk","ven"},
			
		};
	}
	
	@Test(dataProvider = "getUserdata")
	public void doEnterEmployedetailsTest(String firNm, String mdlNm, String lstNm) {
		myInfoPage.doEnterEemployeDetails(firNm, mdlNm, mdlNm);
	}
	
}


