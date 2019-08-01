package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.Homepage;
import Util.BrowserFactory;

public class ValidateHomepageTest {
	
	@Test
	public void AddingContact() throws InterruptedException {
		WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.firmex.com//");
		Homepage homepage=PageFactory.initElements(driver,Homepage.class);
		homepage.VarifyLoginpage();
	
}
}