package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
	this.driver=ldriver;
	}
		@FindBy(how=How.ID,using="login_user")
		WebElement login;
		
		@FindBy(how=How.ID,using="login_pw")
		WebElement Password;
		
		@FindBy(how=How.ID,using="login_btn")
		
		WebElement SignInButton;
		
       @FindBy(how=How.XPATH,using="//*[contains(text().'User credentials are invalid.')]")
       WebElement loginerror;
		
		

		public void Login(String email,String password) {
			login.sendKeys(email);
			Password.sendKeys(password);
			SignInButton.click();
	}
		public void VarifyLoginpage() {
		login.isDisplayed();
}
		
	
		public void Geterrorloginmessagevalidate() {
			loginerror.getText();
			Assert.assertTrue(loginerror.equals("User credentials are invalid."));
		
		}
		public void Geterrorloginmessagevalidate1() {
			// TODO Auto-generated method stub
			
		}
		}
