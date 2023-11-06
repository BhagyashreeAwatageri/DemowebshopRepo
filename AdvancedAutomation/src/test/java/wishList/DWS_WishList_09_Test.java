package wishList;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_WishList_09_Test extends BaseClass {
	@Test(groups="System Group")
	public void addproductToWishList() {
		Jewellery.getJewelry().click();
		wishlist.getSelectJewellery().click();
		wishlist.getWishListButton().click();
		wishlist.getwishlistlink().click();
		assertTrue(wishlist.getSelectJewellery().isDisplayed());
		System.out.println("Jewellery added to wishlist");
	}
}
