package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Orderpage extends Basepage {

	public Orderpage(WebDriver driver) {
		super(driver);
	}

	By addBulkOrders=By.xpath("//button[@align='right']");
	By chooseFile=By.xpath("//fieldset[@aria-hidden='true']");
	By importButton=By.xpath("//button[text()='Import']");
	By validateData=By.xpath("//button[text()='Validate Data']");
	
	
	public void clickOnAddBulkOrders() {
		
		WebElement add=driver2.findElement(addBulkOrders);
		Actions action =new Actions(driver2);
		action.moveToElement(add)
		      .click()
		      .perform();
		
		//clickElement(addBulkOrders);
	}
	
	public void clickOnChooseFile() {
		
		WebElement choosefileElement= driver2.findElement(chooseFile);
		
		//actionclass used as element not clickable
		
		Actions action =new Actions(driver2);
		action.moveToElement(choosefileElement)
		      .click()
		      .perform();
		
	}
	
	public void selectFilePath() throws Exception {
		
		 Robot robo=new Robot();
		 
		 String path="C:\\Users\\Man\\Downloads\\demo-data.xlsx";
		 
		    // copying File path to Clipboard
		    StringSelection string = new StringSelection(path);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		 
		    // press Contol+V for pasting
		    robo.keyPress(KeyEvent.VK_CONTROL);
		    robo.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V after pasting
		    robo.keyRelease(KeyEvent.VK_CONTROL);
		    robo.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		    robo.keyPress(KeyEvent.VK_ENTER);
		    robo.keyRelease(KeyEvent.VK_ENTER);
		   
	}
	
	public void clickOnImport() {
		clickElement(importButton);
	}
	public void clickOnValidateData() {
		clickElement(validateData);
	}
	
}
