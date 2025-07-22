package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrmMyInfoPage {
	
	
	private WebDriver driver;
	private ElementUtils ele;
	
	
	public OrmMyInfoPage(WebDriver driver) {
		this.driver = driver;
		ele = new ElementUtils(driver);
		
	}
	
	private By myInfolink = By.xpath("//li[@class='oxd-main-menu-item-wrapper']//following-sibling::span[text()='My Info']");
	private By employeFullName = By.xpath("//input[@name='firstName']");
	private By employeMiddleName = By.xpath("//input[@name='middleName']");
	private By employeLastName = By.xpath("//input[@name='lastName']");
	private By saveBtn = By.xpath("(//button[@type='submit'])[1]");
	
	
	public void doSelectMyInfoLink() {
		//ele.getElement(myInfolink).click();
		ele.waitForElementPresent(myInfolink, 10).click();
	}
	
	public void doEnterEemployeDetails(String employFullNm, String employMiddleNm, String employLastName) {
		 ele.getElement(employeFullName).sendKeys(employFullNm);    
		ele.getElement(employeMiddleName).sendKeys(employMiddleNm);
		ele.getElement(employeLastName).sendKeys(employLastName);
		
		doselectSavebtn();
		
	}
	
	public void doselectSavebtn() {
		 ele.getElement(saveBtn).click();
	}
	

}
