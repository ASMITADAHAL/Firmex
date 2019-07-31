package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver ldriver) {
	this.driver=ldriver;
	}
		@FindBy(how=How.ID,using="login_user")
		static
		WebElement login;
		@FindBy(how=How.ID,using="login_pw")
		WebElement Password;
		@FindBy(how=How.ID,using="login_btn")
		WebElement SignInButton;
		

		public void Login(String email,String password) {
			login.sendKeys(email);
			Password.sendKeys(password);
			SignInButton.click();
	}
		public static  void VarifyLoginpage() {
		login.isDisplayed();
}}
