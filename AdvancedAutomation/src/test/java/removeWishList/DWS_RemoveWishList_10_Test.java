package removeWishList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_RemoveWishList_10_Test extends BaseClass{
	@Test
	public void removefromWishList() {
		Jewellery.getJewelry().click();
		wishlist.getSelectJewellery().click();
		wishlist.getWishListButton().click();
		wishlist.getwishlistlink().click();
		remwishlist.getProductCheckBox().click();
		remwishlist.getUpdateWishList().click();
		boolean flag=true;
		try { 
			remwishlist.getProductCheckBox(); 
		} catch(Exception e) {
			flag=false;
			e.printStackTrace(); 
		}
		if(flag==false) {
			System.out.println("wishlist is not empty");
		}
	}

}
	