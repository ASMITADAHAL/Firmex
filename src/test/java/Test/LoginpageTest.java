package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.Loginpage;
import Util.BrowserFactory;

public class LoginpageTest {
	@Test 
	public void FirmexLogintest() {
		WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.firmex.com//");
		Loginpage loginfirmex=PageFactory.initElements(driver, Loginpage.class);
		loginfirmex.Login("asmitadahal248@gmail.com", "abc123");
		driver.close();
		driver.quit();
	}
		
		
		
		
		
		
	}



