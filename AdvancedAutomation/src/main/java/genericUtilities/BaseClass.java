package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.AddBookToCart;
import objectRepository.AddToCartPage;
import objectRepository.CompareTwoProducts;
import objectRepository.Jewellery;
import objectRepository.LoginPage;
import objectRepository.Registeration;
import objectRepository.WishListPage;
import objectRepository.emailErrorMsgPage;
import objectRepository.removeWishListPage;

public class BaseClass implements IAutoConstants{
	public static WebDriver driver;
	PropertyUtility property;
	public static TakesScreenshotUtility screenshot;
	public static WebDriverUtility webdriverUtility;
	public static ExtentTest Logger;
	public static LoginPage LoginPage;
	public static CompareTwoProducts CompareTwoProducts;
	public static Jewellery Jewellery;
	public static emailErrorMsgPage mailErrorMsg;
	public static WishListPage wishlist;
	public static removeWishListPage remwishlist;
	public static Registeration Registeration;
	public static AddToCartPage AddToCartPage;
	public static AddBookToCart AddBookToCart;
	
	JavaUtility javaUtility;
	DatabaseUtility dbUtility;
	/**
	 * This method is used to launch the browser and navigate to application
	 */
	@BeforeClass(alwaysRun=true)
	public void launchingBrowserAndNavigatingToApp(){
		property = new PropertyUtility();
		//screenshot=new TakesScreenshotUtility(driver); 
//if u give it here then the driver reference is null so it will take null value, so write it after initialization of everything		
		if(BROWSER.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));
		webdriverUtility = new WebDriverUtility(driver);
		screenshot=new TakesScreenshotUtility(driver);
		dbUtility = new DatabaseUtility();
		javaUtility = new JavaUtility();
		LoginPage=new LoginPage(driver);
		CompareTwoProducts = new CompareTwoProducts(driver);
		Jewellery = new Jewellery(driver);
		mailErrorMsg = new emailErrorMsgPage(driver);
		wishlist = new WishListPage(driver);
		remwishlist = new removeWishListPage(driver);
		Registeration = new Registeration(driver);
		AddToCartPage=new AddToCartPage(driver);
		AddBookToCart = new AddBookToCart(driver);
	}
	    
	/**
	 * This method is used to login to the application
	 */
	@BeforeMethod(alwaysRun=true)
	public void loginToApplication(){
		
		
		System.out.println("Logged in to the application");
	}
	/**
	 * This method is used to logout from application
	 */
	@AfterMethod(alwaysRun=true)
	public void logOutFromApplication() {
		System.out.println("Logged out from the application");
	}
	/**
	 * This method is used to close the browser
	 */
	@AfterClass(alwaysRun=true)
	public void tearDownTheBrowser() {
		driver.quit();
		
		
	}
}	
	
	
	
	
	
	
	
	
// This is used for iTestListner	
	//public static WebDriver driver;
	//public static TakesScreenshotUtility uti;
	//@BeforeMethod
	//public static void demo() {
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//uti=new TakesScreenshotUtility(driver);
	//}



