package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpage extends Basepage{

	public Dashboardpage(WebDriver driver) {
		super(driver);
	}

	By orderMenu=By.className("css-sukebr");
	By orders=By.xpath("//a[@href='/mis/orders']");
	
	
	public void clickOnOrderMenu() {
		clickElement(orderMenu);
	}
	
	public void clickOnOrders() {
		clickElement(orders);
	}
	
	
}
