package SunShineContactStepDefinition;

import SunShineContactPageAction.SunShineContactAction;
import SunShineContactPageAction.SunShineHomeAction;
import SunShineContactUtilityDB.SunShineContactBase;
import SunShineContactUtilityDB.SunShineContactUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SunShineContact extends SunShineContactBase{
	SunShineHomeAction sunShineHomeAction = new SunShineHomeAction();
	SunShineContactAction sunShineContactAction =new SunShineContactAction ();
	
	@Given("^Launch demoblaze <\"([^\"]*)\"> Application$")
	public void launch_demoblaze_Application(String URL) throws Throwable {
		SunShineContactURL(URL); 
	}
	@Then("^Verify Contact Email field in Contact Page$")
	public void verify_Contact_Email_field_in_Contact_Page() throws Throwable {
		 
	}

	@Then("^Verify Contact Name field in Contact Page$")
	public void verify_Contact_Name_field_in_Contact_Page() throws Throwable {
	   
	}

	@Then("^Verify Message field in Contact Page$")
	public void verify_Message_field_in_Contact_Page() throws Throwable {
	    
	}

	@Then("^Verify send message button is clickable$")
	public void verify_send_message_button_is_clickable() throws Throwable {
	   
	}

	@Then("^Click Contact Link$")
	public void click_Contact_Link() throws Throwable {
		sunShineHomeAction.ClickContactLink();  
	}
		
	@Then("^Enter email address in contact email field$")
	public void enter_email_address_in_contact_email_field() throws Throwable {
		sunShineContactAction.Enteremailaddressincontactemailfield();  
	}

	@Then("^Enter contact name in contact name field$")
	public void enter_contact_name_in_contact_name_field() throws Throwable {
		sunShineContactAction.Entercontactnameincontactnamefield();   
	}

	@Then("^Enter message in message field$")
	public void enter_message_in_message_field() throws Throwable {
		sunShineContactAction.Entermessageinmessagefield();
		
	}
	@Then("^Click send message button$")
	public void click_send_message_button() throws Throwable {
		sunShineContactAction.Clicksendmessagebutton(); 
	}
	@Then("^Verify  User able to send a message after clicking the Send button$")
	public void verify_User_able_to_send_a_message_after_clicking_the_Send_button() throws Throwable {
		sunShineHomeAction.VerifyUserabletosendamessageafterclickingtheSendbutton(); 
		SunShineContactUtility.takeMyScreenshot(driver, "homepage");
	}


}
