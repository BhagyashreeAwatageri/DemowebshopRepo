
package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class Jewellery extends BaseClass{
	public Jewellery(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(partialLinkText = "Jewelry")
	private WebElement Jewelry;
	
	@FindBy(xpath = "//a[@href=\"https://demowebshop.tricentis.com/jewelry?price=0-500\"]")
	private WebElement priceRangeFilter;
	
	
	@FindBy(xpath = "(//div[@class=\"add-info\"])[2]")
	private WebElement jProduct;


	public WebElement getJewelry() {
		return Jewelry;
	}


	public WebElement getPriceRangeFilter() {
		return priceRangeFilter;
	}


	public WebElement getjProduct() {
		return jProduct;
	}
	
	
	

}
