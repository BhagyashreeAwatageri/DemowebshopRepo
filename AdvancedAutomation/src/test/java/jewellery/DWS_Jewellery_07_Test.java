
package jewellery;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Jewellery_07_Test extends BaseClass{
	@Test(groups="IT")
	public void compare_Jewellery_Price() {
		Jewellery.getJewelry().click();
		String productPriceRange=Jewellery.getPriceRangeFilter().getText();
		Jewellery.getPriceRangeFilter().click();
		String s1=productPriceRange.substring(7, 10);
		int productPricerange=Integer.parseInt(s1);
		
		List<WebElement> allPrices=driver.findElements(By.xpath("//div[@class='add-info']"));
		int strnum=0;
		for(WebElement price:allPrices) {
			String substr=price.getText().substring(0, price.getText().length()-3);
			strnum=Integer.parseInt(substr);
			System.out.println(strnum);
			
		}
		
		assertTrue(strnum<=productPricerange);
		System.out.println("All products within range");
		//Logger.log(Status.INFO, "Jewellery is in selected range only");
	}
		

}
