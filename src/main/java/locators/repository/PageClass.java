package locators.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import customclass.BaseClass;

public class PageClass extends BaseClass {

	public  PageClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Previous Releases']")
	private WebElement link;

	public WebElement getLink() {
		return link;
	}
	
	
}
