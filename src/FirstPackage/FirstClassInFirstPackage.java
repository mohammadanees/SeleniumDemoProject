package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstClassInFirstPackage {
	
	@BeforeMethod(enabled=false)
	public static void beforeMethodCode() {
	System.out.println("beforeMethodcode");	
	
	}
	
	@Test(priority=1)
	public static void firstMethodFirstClassFirstPackage() {
		System.out.println("firstMethodFirstClassFirstPackage");
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(false);
		//Assert.assertFalse(true);
		System.out.println("After fail");
		sf.assertAll();
	}
	
	@Test(priority=2, enabled=true)
	public static void SecondMethodFirstClassFirstPackage() {
		System.out.println("SecondMethodFirstClassFirstPackage");
		Assert.assertFalse(false);
	}
	
	@AfterMethod(enabled=false)
	public static void afterMethodCode() {
		System.out.println("afterMethodCode");
	}
 
}
