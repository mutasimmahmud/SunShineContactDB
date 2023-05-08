package SunShineContactRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import SunShineContactUtilityDB.SunShineContactBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Folder"},
plugin = {"json:target/cucumber.json"},
glue = "SunShineContactStepDefinition" ,tags = {"@DisplayVerification"})

public class SunShineContactTestRunner extends AbstractTestNGCucumberTests{
@BeforeTest
public void SunShineContactOpenURL() {
	SunShineContactBase test= new SunShineContactBase();
	test.SunShineContactBrowser();
	
}
@AfterTest
public void SunShineContactCloseURL() {
	SunShineContactBase test= new SunShineContactBase();
	test.driver.quit();
}
}
