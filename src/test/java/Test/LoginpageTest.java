package Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.LoginPage;
import Util.BrowserFactory;


public class LoginpageTest {
@Test 
public void FirmexLogintest() {
	WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.firmex.com//");
	assertTrue(driver.getTitle().contains("Firmex Virtual Data Room Login"));
	LoginpageTest loginfirmex=PageFactory.initElements(driver, LoginpageTest.class);
	loginfirmex.Login("asmitadahal248@gmail.com", "abc123");
	loginfirmex.Geterrorloginmessagevalidate();
	driver.close();
	driver.quit();
}

private void Geterrorloginmessagevalidate() {
	// TODO Auto-generated method stub
	
}

private void Login(String string, String string2) {
	// TODO Auto-generated method stub
	
}

}
