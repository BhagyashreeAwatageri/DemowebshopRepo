package compare;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Compare_05_Test extends BaseClass{
	

	@Test(groups="ST")
	public void comapare_two_products() throws InterruptedException {
		CompareTwoProducts.getComputers().click();
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on computers");
		CompareTwoProducts.getDesktops().click();
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on desktops");
		CompareTwoProducts.getProduct1().click();
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on product1");
		CompareTwoProducts.getAddToCompareList().click();
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on addTolist");
		CompareTwoProducts.getComputers().click();
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on login link");
		CompareTwoProducts.getDesktops().click();
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on desktops");
		CompareTwoProducts.getProduct2().click();
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on product2");
		CompareTwoProducts.getAddToCompareList().click();
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on addTolist");
		
		assertTrue(CompareTwoProducts.getProduct1().isDisplayed());
		//Logger.log(Status.INFO, "Product added to compare list");
		  
		 
		 }
		
	}





