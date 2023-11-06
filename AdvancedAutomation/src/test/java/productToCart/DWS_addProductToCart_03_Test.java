package productToCart;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_addProductToCart_03_Test extends BaseClass{
	@Test(groups="ST")
	public void addProductToCart() {
		LoginPage.getLoginLink().click();
		LoginPage.getEmailTF().sendKeys("bhagyaawatageri98@gmail.com");
		LoginPage.getPasswordTF().sendKeys("Bhagya@98");
		LoginPage.getLoginButton().click();
		
		AddToCartPage.getAddToCartButton().click();
		AddToCartPage.getShoppingCart().click();
		assertTrue(AddToCartPage.getProduct().isDisplayed());
		
		AddBookToCart.getRemoveCart().click();
		AddBookToCart.getUpdateCart().click();
	}

}
