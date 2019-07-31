package Test;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import Page.Homepage;
import Util.BrowserFactory;

public class ValidateHomepageTest {
	@Test
	public void AddingContact() throws InterruptedException {
		WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.firmex.com//");
		Homepage homepage=BrowserFactory.initElements(driver,Homepage.class);
		Homepage.VarifyLoginpage();
	
}
}