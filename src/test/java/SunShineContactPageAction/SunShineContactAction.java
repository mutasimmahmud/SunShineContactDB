package SunShineContactPageAction;

import SunShineContactPageLocator.SunShineContactLocator;
import SunShineContactUtilityDB.SunShineContactBase;
import SunShineContactUtilityDB.SunShineContactTestData;

public class SunShineContactAction extends SunShineContactBase{
	SunShineContactLocator sunShineContactLocator = new SunShineContactLocator();
	
	public void Enteremailaddressincontactemailfield() {
		sunShineContactLocator.ContactEmail.sendKeys(SunShineContactTestData.ContactEmail);	
	}
	public void Entercontactnameincontactnamefield() {
		sunShineContactLocator.ContactName.sendKeys(SunShineContactTestData.ContactName);	
	}
	public void  Entermessageinmessagefield() {
		sunShineContactLocator.ContactMessage.sendKeys(SunShineContactTestData.ContactMessage);	
	}
	public void Clicksendmessagebutton() throws Exception {
		Thread.sleep(3000);
		sunShineContactLocator.SendMessage.click();
		driver.switchTo().alert().accept();
		
	}

}
