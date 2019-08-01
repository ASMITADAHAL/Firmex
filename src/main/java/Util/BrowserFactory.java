package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
	
static WebDriver driver;

public static WebDriver startBrowser(String browserName, String url ){
	
	
	if (browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("WebDriver.chrome.driver", "./firmex1/Driver/chromedriver.exe");
		
	}
	
	
		
	driver.get(url);
	return driver;
}

}


