package genericUtilities;

import java.util.Random;
/**
 * 
 * @author Bhagya
 *
 */
public class JavaUtility {
	/**
	 * This method is used to generate random number in given range
	 * @param range
	 * @return
	 */
	public int generateRandomNumber(int range) {
		Random r= new Random();
		return r.nextInt(range);
	}

}
