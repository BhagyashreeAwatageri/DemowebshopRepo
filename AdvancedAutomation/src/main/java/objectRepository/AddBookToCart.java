package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class AddBookToCart extends BaseClass{
	public AddBookToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Books")
	private WebElement books;
	
	@FindBy(xpath = "(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
	private WebElement addBookToCart;
	
	@FindBy(linkText = "Computing and Internet")
	private WebElement bookingCart;
	
	@FindBy(name = "removefromcart")
	private WebElement removeCart;
	
	@FindBy(name = "updatecart")
	private WebElement updateCart;

	public WebElement getBooks() {
		return books;
	}

	public WebElement getAddBookToCart() {
		return addBookToCart;
	}

	public WebElement getBookingCart() {
		return bookingCart;
	}

	public WebElement getRemoveCart() {
		return removeCart;
	}

	public WebElement getUpdateCart() {
		return updateCart;
	}
	
	

}
