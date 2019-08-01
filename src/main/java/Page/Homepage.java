package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Homepage {
	WebDriver driver;
	public  Homepage (WebDriver ldriver) {
		this.driver= ldriver;
	}
	@FindBy(how=How.CLASS_NAME,using="custom-logo")
	WebElement Logo;
	

public  void VerifyLoginpage() {
	Logo.isDisplayed();
}
		


	public  void VarifyLoginpage() {
		Logo.isDisplayed();
	}







	}
