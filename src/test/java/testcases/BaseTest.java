package testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Loginpage;
import pages.Orderpage;
import pages.Dashboardpage;


public abstract class BaseTest {

	WebDriver driver;
	Loginpage loginpage;
	Dashboardpage dashpage;
	Orderpage orderpage;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		loginpage=new Loginpage(driver);
		dashpage=new Dashboardpage(driver);
		orderpage=new Orderpage(driver);
	}
	
	@AfterMethod(enabled=false)
	public void tearDown() {
		driver.close();
	}
	
	
}
