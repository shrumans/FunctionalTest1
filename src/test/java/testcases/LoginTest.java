package testcases;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testUtils.Utilss;

public class LoginTest extends BaseTest {

	@Test
	public void LoginAndFileUploadTest() throws Exception{
		
		loginpage.enterUserName();
		Utilss.hardWait(1);
		System.out.println("username entered");
		loginpage.enterPassword();
		Utilss.hardWait(1);
		System.out.println("password entered");
		loginpage.clicklogin();
		Utilss.hardWait(1);
		System.out.println("Login successful");
		dashpage.clickOnOrderMenu();
		Utilss.hardWait(1);
		dashpage.clickOnOrders();
		Utilss.hardWait(3);
		System.out.println("clicked on orders");
		orderpage.clickOnAddBulkOrders();
		Utilss.hardWait(2);
		System.out.println("clicked on addBulkOrders");
		orderpage.clickOnChooseFile();
		Utilss.hardWait(2);
		orderpage.selectFilePath();
		Utilss.hardWait(2);
		System.out.println("file upload successful");
		orderpage.clickOnImport();
		Utilss.hardWait(1);
		System.out.println("clicked on Import");
		orderpage.clickOnValidateData();
		Utilss.hardWait(1);
		System.out.println("clicked on ValidateData");
		//Handling Alert
		driver.switchTo().alert().accept();
		Utilss.hardWait(3);
		
		//taking screenshot of last screen
		
		TakesScreenshot sshot= (TakesScreenshot) driver;
		File ss=sshot.getScreenshotAs(OutputType.FILE);
		
		File ScreenShotFile= new File("user.dir"+File.separator+"screenshot.png");
		FileUtils.copyFile(ss,ScreenShotFile);
		
	}
	
	
}
