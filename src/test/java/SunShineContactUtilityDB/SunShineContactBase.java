package SunShineContactUtilityDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SunShineContactBase {
	public static WebDriver driver;
	public static Properties pro;
	
	public SunShineContactBase()
	{
		try {
			FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\SunShineContactConfiguration\\SunShineContact.Properties");
		    pro= new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please check your code");
			e.printStackTrace();
		}
		
	}
	public void  SunShineContactBrowser() {
		String browser=pro.getProperty("Browser1");
		if(browser.equalsIgnoreCase("Edge")) {
						System.setProperty("webdriver.edge.driver",(System.getProperty("user.dir")+"\\WebDriverFolder\\msedgedriver.exe"));
						EdgeOptions options = new EdgeOptions();
						options.addArguments("--remote-allow-origins=*");
						driver=new EdgeDriver(options);
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(SunShineContactTestData.implicitlyWait));
						driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(SunShineContactTestData.pageLoadTimeout));
						driver.manage().window().maximize();
						driver.manage().deleteAllCookies();
	}
		else if (browser.equalsIgnoreCase("FF"));
}
	public static void SunShineContactURL(String URL) {
		driver.get("https://demoblaze.com/");
	}
} 