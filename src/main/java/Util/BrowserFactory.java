package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Homepage;

public class BrowserFactory {
	
static WebDriver driver;

public static WebDriver startBrowser(String browserName, String url ){
	
	
	if (browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./firmex1/Driver/chromedriver.exe");
		
	}
	
		
	driver.get(url);
	return driver;
}

public static Homepage initElements(WebDriver driver2, Class<Homepage> class1) {
	// TODO Auto-generated method stub
	return null;
}

}
