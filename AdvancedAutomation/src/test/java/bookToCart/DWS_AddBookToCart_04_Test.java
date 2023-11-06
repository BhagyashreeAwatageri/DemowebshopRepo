package bookToCart;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_AddBookToCart_04_Test extends BaseClass{
	@Test(groups="ST")
	public void addBookToCart() throws InterruptedException {
		AddBookToCart.getBooks().click();
		Thread.sleep(2000);
		
		AddBookToCart.getAddBookToCart().click();
		Thread.sleep(2000);
		
		AddToCartPage.getShoppingCart().click();
		
		assertTrue(AddBookToCart.getBookingCart().isDisplayed());
		
		AddBookToCart.getRemoveCart().click();
		AddBookToCart.getUpdateCart().click();

}
}
