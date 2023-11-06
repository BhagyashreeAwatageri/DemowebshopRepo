package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareTwoProducts {
	public CompareTwoProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(partialLinkText = "Computers")
	private WebElement computers;
	
	@FindBy(partialLinkText = "Desktops")
	private WebElement desktops;
	
	@FindBy(xpath = "//img[@alt=\"Picture of Build your own cheap computer\"]")
	private WebElement product1;
	
	@FindBy(xpath = "//input[@value=\"Add to compare list\"]")
	private WebElement addToCompareList;
	
	@FindBy(xpath = "//img[@alt=\"Picture of Build your own computer\"]")
	private WebElement product2;
	
	@FindBy(xpath = "//input[@value=\"Remove\"]")
	private List<WebElement> removebutton;
	
	public List<WebElement> getRemovebutton() {
		return (List<WebElement>)removebutton;
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getDesktops() {
		return desktops;
	}

	public WebElement getProduct1() {
		return product1;
	}

	public WebElement getAddToCompareList() {
		return addToCompareList;
	}

	public WebElement getProduct2() {
		return product2;
	}

	public Object getsize() {
		
		// TODO Auto-generated method stub
		return getsize();
	}
	
	
	

}
