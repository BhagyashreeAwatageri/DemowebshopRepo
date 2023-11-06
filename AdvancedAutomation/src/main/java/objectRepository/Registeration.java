package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class Registeration extends BaseClass{
	public Registeration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Register")
	private WebElement registerationLink;
	
	@FindBy(id = "gender-female")
	private WebElement gender;
	
	@FindBy(id = "FirstName")
	private WebElement firstName;
	
	@FindBy(id = "LastName")
	private WebElement lastName;
	
	@FindBy(id = "Email")
	private WebElement registeredEmail;
	
	@FindBy(id = "Password")
	private WebElement registeredPassword;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement registeredConfirmPassword;
	
	@FindBy(id = "register-button")
	private WebElement registrationButton;

	public WebElement getRegisterationLink() {
		return registerationLink;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getRegisteredEmail() {
		return registeredEmail;
	}

	public WebElement getRegisteredPassword() {
		return registeredPassword;
	}

	public WebElement getRegisteredConfirmPassword() {
		return registeredConfirmPassword;
	}

	public WebElement getRegistrationButton() {
		return registrationButton;
	}
	
	


}
