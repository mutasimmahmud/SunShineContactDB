package SunShineContactPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SunShineContactUtilityDB.SunShineContactBase;

public class SunShineHomeLocator extends SunShineContactBase{

	public SunShineHomeLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Contact']")
	public WebElement ClickContactLink;
	
	@FindBy(id="cat")
	public WebElement ValidationofContact;
	
}
