package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class AddToCartPage extends BaseClass{
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
	private WebElement addToCartButton;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCart;
	
	@FindBy(linkText = "Shopping cart(0)")
	private WebElement shoppingCartzero;
	
	@FindBy(linkText = "14.1-inch Laptop")
	private WebElement product;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getShoppingCartzero() {
		return shoppingCartzero;
	}

	public WebElement getProduct() {
		return product;
	}

	
	
	


}
