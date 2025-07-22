package TestFiles;

import org.testng.annotations.Test;

import BaseTset.BaseTest;

public class LoginPageTest extends BaseTest {
	
	
	@Test
	public void doselectLoginBtn()  {
		login.selectLoginBtn();
	}
	
	@Test
	public void doSelectCheckbox() {
		login.selectCheckbox();
	}
	@Test
	public void dodocSignLoginBtn() {
		login.docSignLoginbtn();
	}

}
