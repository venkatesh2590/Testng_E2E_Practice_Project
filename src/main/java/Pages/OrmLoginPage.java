package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtils;

public class OrmLoginPage {
	
	private WebDriver driver;
	private ElementUtils ele;
	
	
	public OrmLoginPage(WebDriver driver) {
		this.driver = driver;
		ele = new ElementUtils(driver);
		
		
	}
	
	private By userName= By.xpath("//input[@name='username' and @placeholder='Username']");
	private By password = By.xpath("//input[@name='password' and @placeholder='Password']"); 
	private By loginbtn = By.xpath("//button[@type='submit']");
	private By orangeHrmtext = By.xpath("//p[text()='OrangeHRM OS 5.7']");
	private By orangeHrmLink = By.xpath("//a[text()='OrangeHRM, Inc']");
	
	
	
	public void getorangeHrmtext() {
		String hrmtext=ele.getElement(orangeHrmtext).getText();
		System.out.println(hrmtext);
		
		
	}
	
	public void getOrangeHrmLink() {
		 String hrmLinkText=ele.getElement(orangeHrmLink).getText();
		 System.out.println(hrmLinkText);
		
	}
	
//	public void isgetOrangeHrmLinkExist() {
//		return 
//	}
	
	public OrmHomePage doLogin(String un,String pwd) {
		ele.getElement(userName).sendKeys(un);
		ele.getElement(password).sendKeys(pwd);
		ele.getElement(loginbtn).click();
		
		return new OrmHomePage(driver);
		
	}
	
	

}
