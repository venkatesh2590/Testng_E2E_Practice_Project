package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Constants;
import Utils.ElementUtils;

public class OrmHomePage {

	
	private WebDriver driver;
	private ElementUtils ele;
	
	public OrmHomePage(WebDriver driver) {
		this.driver = driver;
		ele = new ElementUtils(driver);
		
	}
	
	private By adminLink = By.xpath("//span[text()='Admin']");
	private By ormHomapgeUserName = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group__label-wrapper']//following-sibling::div/input[@class='oxd-input oxd-input--active']");
	private By userRole = By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters']//following-sibling::div[@class='oxd-select-wrapper'])[1]");
	private By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
	private By submitbtn = By.xpath("//button[@type='submit']");
	private By leaveIcon = By.xpath("//span[text()='Leave']");
	
	
	public void selectAdminLink() {
		ele.getElement(adminLink).click();
	}
	
	public void enterUserName() {
		ele.getElement(ormHomapgeUserName).sendKeys("Admin");
	}
	
	public void setEmployeeName() {
		ele.getElement(employeeName).sendKeys("Admin");
	}
	
	public void selectSearchBtn() {
		ele.getElement(submitbtn).click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
//	public OrmLeavePage selectLeaveIcon() {
//		ele.waitForElementToBeVisible(leaveIcon, 20).click();
//		//ele.getElement(leaveIcon).click();
//		return new OrmLeavePage(driver);
//		
//	}
	
	}
