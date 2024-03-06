package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends Basepage{

	public Loginpage(WebDriver driver) {
		super(driver);
	
	}

	By uname= By.name("username");
	By pword=By.name("password");
	By loginButton=By.xpath("//button[contains(@class,'MuiButton-root')]");
	
	
	public void enterUserName() {
		typeText(uname, "prexo.mis@dealsdray.com");
		
	}
	
	public void enterPassword() {
		typeText(pword, "prexo.mis@dealsdray.com");
		
	}
	
	public void clicklogin() {
		clickElement(loginButton);
		
	}
	
}
