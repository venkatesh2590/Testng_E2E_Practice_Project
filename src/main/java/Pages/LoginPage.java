package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.ElementUtils;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtils ele;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	private By lognBtn = By.xpath("//button[text()='Log in']//parent::li");
	private By checkbox_login = By.xpath("//label[contains(text(),'preconfigured login')]");
	private By docSign_login_btn= By.xpath("//button[contains(@class,'btn-success') and normalize-space(.)='Log in']");
	private By frame = By.tagName("iframe");
	
	public void selectLoginBtn()  {
		//ele.doClick(lognBtn);
		driver.findElement(lognBtn).click();
		driver.switchTo().frame(1);
		
	}
	
	public void selectCheckbox() {
		
		
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.elementToBeClickable(checkbox_login));
		  ele.doClick(checkbox_login);
	}
	
	public void docSignLoginbtn() {
		 
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.elementToBeClickable(docSign_login_btn));
		  ele.doClick(docSign_login_btn);
	}

}
