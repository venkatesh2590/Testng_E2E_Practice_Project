package TestFiles;

import org.testng.annotations.Test;

import BaseTset.BaseTest;
import junit.framework.Assert;

public class OrmLoginPageTest extends BaseTest {
	
	@Test
	public void togetOrmPageText() {
		opage.getorangeHrmtext();
		
	}
	
	@Test
	public void  togetormLinktext() {
		opage.getOrangeHrmLink();
	}
	
	@Test
	public void hrmLogin() {
		opage.doLogin(p.getProperty("userName"), p.getProperty("password"));
		
		
	}
	
	
	

}
