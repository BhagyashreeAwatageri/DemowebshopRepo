package register;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Register_02_Test extends BaseClass{
	@Test(groups="FT")
	public void userRegisteration() {
		
		Registeration.getRegisterationLink().click();
		Registeration.getGender().click();
		Registeration.getFirstName().sendKeys("Bhagya");
		Registeration.getLastName().sendKeys("Awatageri");
		Registeration.getRegisteredEmail().sendKeys("bhagyashreeawatageri@gmail.com");
		Registeration.getRegisteredPassword().sendKeys("Selenium123");
		Registeration.getRegisteredConfirmPassword().sendKeys("Selenium123");
		Registeration.getRegistrationButton().click();
	

	}

}
