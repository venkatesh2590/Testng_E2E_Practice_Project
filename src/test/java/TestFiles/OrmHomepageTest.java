package TestFiles;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseTset.BaseTest;

import Utils.Constants;


public class OrmHomepageTest extends BaseTest{
	
	
	@BeforeClass
	public void homePageSetUp() {
		ohpage=opage.doLogin(p.getProperty("userName"), p.getProperty("password"));
	}
	
	@Test
	public void doSelectAdminLink() {
		ohpage.selectAdminLink();
	}
	
	@Test
	public void setUserName() {
		ohpage.enterUserName();
	}

	@Test
	public void enterEmployeeName() {
		ohpage.setEmployeeName();
	}
	
	@Test
	public void doSelectSearchBtn() {
		ohpage.selectSearchBtn();
	}
	
	@Test
	public void getHometPagetitleTest() {
		String homepagetitle=ohpage.getHomePageTitle();
		System.out.println(homepagetitle);
		Assert.assertEquals(homepagetitle, "OrangeHRM");
		
	}
	
//	@Test
//	public void doSelectLeavebtnTest() {
//		ohpage.selectLeaveIcon();
//		
//	}
	
	
}
