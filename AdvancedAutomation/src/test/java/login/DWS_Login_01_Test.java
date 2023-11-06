
package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_Login_01_Test extends BaseClass{
	@Test
	public void login_to_application() throws InterruptedException{
		LoginPage.getLoginLink().click();
		//Logger.log(Status.INFO, "User click on login link");
		LoginPage.getEmailTF().sendKeys("bhagyaawatageri@gmail.com");  // data is taken from excel file
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on email TF");
		LoginPage.getPasswordTF().sendKeys("Bhagya@98"); // if u give value within double quotes then it is taken as value and without double quotes it is parameter
		Thread.sleep(2000);
		//Logger.log(Status.INFO, "User click on password TF");
		LoginPage.getLoginButton().click();
		Thread.sleep(2000);

	}
}
