package SunShineContactPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SunShineContactUtilityDB.SunShineContactBase;

public class SunShineContactLocator extends SunShineContactBase{

	public SunShineContactLocator() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="recipient-email")
public WebElement ContactEmail;

@FindBy(id="recipient-name")
public WebElement ContactName;

@FindBy(id="message-text")
public WebElement ContactMessage;

@FindBy(xpath="//button[text()='Send message']")
public WebElement SendMessage;

}
