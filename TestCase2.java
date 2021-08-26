package RegretionTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test
	public void validate() {
		String expected = "yahoo.com"; //from specification
		String actual = "gmail.com"; //from selenium
		
		//Assert.assertEquals(actual, expected);
		SoftAssert softAssert = new SoftAssert();
			
		System.out.println("Validating title");
		softAssert.assertEquals(actual, expected);
		
		System.out.println("Validating image");
		softAssert.assertEquals(true, false);
		
		softAssert.assertAll();
		//isElementPresent("xpath") - true if found, otherwise false
		//Assert.assertTrue(isElementPresent("xpath")); - будет например true
		//Assert.assertTrue(false, "element not found");
		//Assert.fail("Failing test as the condition is not met"); //например кнопка не найдена или юзер не залогинился
		
	}
}
