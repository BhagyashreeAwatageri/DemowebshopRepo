package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(id = "Email")
	private WebElement emailTF;

	@FindBy(id = "Password")
	private WebElement passwordTF;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLoginLink() {
		// TODO Auto-generated method stub
		return loginLink;
	}


	






}
