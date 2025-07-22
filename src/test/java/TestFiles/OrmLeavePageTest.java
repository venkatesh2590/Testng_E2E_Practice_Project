package TestFiles;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTset.BaseTest;
import Pages.OrmLeavePage;

public class OrmLeavePageTest extends BaseTest{
	
	@BeforeClass
	public void leavePageSetUp() {
		ohpage=opage.doLogin(p.getProperty("userName"), p.getProperty("password"));
		
		
		
		
	}
	
	@Test
	public void doSelectLeavebtnTest() {
		lpage.selectLeaveIcon();
		
	}
	
		
	
	
	@Test
	public void doenterEmployeNameTest() {
		lpage.enterEmployeName();
	}

}
