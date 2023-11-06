package removeCart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_RemoveCart_06_Test extends BaseClass{
	@Test(groups="IT")
	public void removeproductfromcart() throws InterruptedException {
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
		
		
		for(int i=0; i<CompareTwoProducts.getRemovebutton().size();) {
			CompareTwoProducts.getRemovebutton().get(i).click();
			
		}
		if( CompareTwoProducts.getRemovebutton().size()==0) {
			System.out.println("all products are removed from compare List");
		}
	}

}
