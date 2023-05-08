package SunShineContactPageAction;

import org.testng.Assert;

import SunShineContactPageLocator.SunShineHomeLocator;
import SunShineContactUtilityDB.SunShineContactBase;

public class SunShineHomeAction extends SunShineContactBase{
	SunShineHomeLocator sunShineHomeLocator =new SunShineHomeLocator();
	
	
public void ClickContactLink() throws Exception {
	 sunShineHomeLocator.ClickContactLink.click();	
	 Thread.sleep(3000);
	 
}
public void VerifyUserabletosendamessageafterclickingtheSendbutton() {
	boolean sun = sunShineHomeLocator.ValidationofContact.isDisplayed();	
	Assert.assertTrue(sun);
	
}
}