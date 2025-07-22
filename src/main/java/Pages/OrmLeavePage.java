package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.ElementUtils;

public class OrmLeavePage {
	
	private WebDriver driver;
	private ElementUtils ele;
	
	public OrmLeavePage(WebDriver driver) {
		this.driver =driver;
		ele = new ElementUtils(driver);
		
	}
	
	private By leaveIcon = By.xpath("//span[text()='Leave']");
	private By employeeName= By.xpath("//input[contains(@placeholder,'Type for hints')]");
	private By searchbtn = By.xpath("//button[@type='submit']");
	
	
	public void selectLeaveIcon() {
		ele.waitForElementToBeVisible(leaveIcon, 20).click();
		//ele.getElement(leaveIcon).click();
		
	}
	
	public void enterEmployeName() {
		ele.getElement(employeeName).sendKeys("naiduabc");
		
	}
	
	public void selectSearchBtn() {
		ele.getElement(searchbtn).click();
		
	}
	
	public String getLeavePageTitle() {
		return driver.getTitle();
	}

}
