package genericUtilities;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Bhagya
 *
 */
public class WebDriverUtility {
	WebDriver driver;
	public Object returnAlertReference;
	//JavascriptExecutor js;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		//js=(JavascriptExecutor)driver;
		// If we declare this javascript here then we need not declare it in every method as we have done below
		
	}
	/**
	 * This method is used to click on element using javascript executor
	 * @param element
	 */
	public void clickingOnElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		// TODO Auto-generated method stub
		
	}
	/** This method is used to enter the data using javascript executor
	 * 
	 * @param element
	 * @param data which has to enter the element
	 */
	public void enteringDataInToElement(WebElement element, String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+data+"'",element);
	}
    // OLD METHOD
	//public void ClickingOnElementUsingJS(WebDriver driver, WebElement Element) {
	//JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("driver.click();", Element);
	
    /**
     * This method returns the reference for webdriverwait to achieve explicit
     * @param time to wait
     * @return
     */
	public WebDriverWait explicitWaitReference(int time) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait;
	}
	/**
	 * This method return the action class reference
	 * @return
	 */
	public Actions actionsReference() {
		Actions action = new Actions(driver);
		return action;
	}
	/**
	 * This method is used to handle drop down
	 * @param element is used to identify element
	 * @param value we are passing
	 */
	public void handlingDropdown(WebElement element, String value) {
		Select select = new Select(element);
		try {
			select.selectByVisibleText(value);
		}catch (NoSuchElementException e) {
			try {
			select.selectByValue(value);
			
		}catch (Exception e1) {
			
			select.selectByIndex(Integer.parseInt(value));
		}
		}
		//int val = Integer.parseInt(value);
		//select.selectByIndex(val);
	}
	/**
	 * This method is used to perform scroll To action
	 * @param x
	 * @param y
	 */
	public void scrollToAction(int x, int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+"");
	}
	/**
	 * This method is used to perform scroll By action
	 * @param x
	 * @param y
	 */
	public void scrollByAction(int x, int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+"");
	}
	/**
	 * This method is used to perform scroll to the element to increase the element visibility
	 * If the status is true the window will scroll until element reaches the top
	 * If the status is false the window will scroll until element reaches the bottom
	 * @param element
	 * @param status
	 */
	public void scrollInToViewAction(WebElement element, Boolean status) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+status+")",element);
	}
	/**
	 * This method is used to switch the driver control from window to frame with help of index
	 * @param index
	 */
	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch the driver control from window to frame with help of name
	 * @param name
	 */
	public void switchingToFrame(String name) {
		driver.switchTo().frame(name);
	}
	/**
	 * This method is used to switch the driver control from window to frame with help of WebElement
	 * @param element
	 */
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch the driver control from frame to window
	 */
	public void switchingBackToMainWindow() {
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is returning the alert reference
	 * @return
	 */
	public Alert retunAlertReference(){
		//driver.switchTo().alert();
		return driver.switchTo().alert();
	}
	/**
	 * This method is used to switch the driver control from one window to another window
	 * @param allWindowId
	 * @param expectedTitle
	 * @param parentId
	 */
	public void switchingToWindow(Set<String> allWindowId, String expectedTitle, String parentId) {
		allWindowId.remove(parentId);
		for(String id:allWindowId) {
			driver.switchTo().window(id);
			if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}
	}
	public void switchingBackToMainWindow(String parentId) {
		driver.switchTo().window(parentId);
	}
	
}
