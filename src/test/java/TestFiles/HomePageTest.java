package TestFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseTset.BaseTest;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class HomePageTest extends BaseTest {
	
	
	
	
	@Test(priority = 0)
	public void homepagetest() {
		home.getHomepageTitle();
		
	}
	
	@Test(priority = 1)
	public void getdocFeatureLists() {
		home.getdocfeatures();
	}
	
	@Test(priority = 2)
	public void clkGetStartBtn() {
		home.clkGetStartedBtn();
	}
	
	@Test(priority = 3)
	public void togetClaimPageTitle() {
		home.getClaimPageTitle();
		
	}
	@Test(priority = 4)
	public void toGetClaimPageTitle()
	{
		home.getClaimPageTitle();
	}
	 
	
	
	
		

	
	


}
