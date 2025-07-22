package Pages;


import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.ElementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	
	
	private WebDriver driver;
	private ElementUtils ele;
	private Properties p;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	private By selectStartedBtn = By.xpath("//div[@class='card-info']//following-sibling::div[@class='card-info-button-holder']//child::a[@href='/submitClaim']//button[@class='btn btn-success' and text()='Get Started']");
	private By doc_sign_features = By.xpath("(//div[@class='card-info-button-holder']//a[@href='/submitClaim']//button//following::div//h4[text()='Docusign features:']//following-sibling::ul)[1]");
	private By claim_text = By.xpath("//h2[text()='Submit a Claim']");
	
	
	
	public void getHomepageTitle() {
		String home_page_title=driver.getTitle();
		System.out.println(home_page_title);
	}
	
	public void getdocfeatures() {
		List<WebElement> doc_feature_lists=ele.getElements(doc_sign_features);
		for(WebElement lists:doc_feature_lists) {
			String lists_text=lists.getText();
			System.out.println(lists_text);
		}
		
	}
	
	public void clkGetStartedBtn() {
		ele.getElement(selectStartedBtn).click();
	}
	
	public void getClaimText() {
		String text_claim=ele.doElementGetText(claim_text);
		System.out.println(text_claim);
	}
	
	public void getClaimPageTitle() {
		String claim_page_title=driver.getTitle();
		System.out.println(claim_page_title);
	}
	
	
	
	

}
