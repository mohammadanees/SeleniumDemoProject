package SecondPackage;

import org.testng.annotations.Test;

public class FirstClassInSecondPackage {
	
	@Test
	public static void firstMethodSecondClassSecondPackage() {
		System.out.println("firstMethodSecondClassSecondPackage");
	}
	
	@Test
	public static void SecondMethodSecondClassSecondPackage() {
		System.out.println("SecondMethodSecondClassSecondPackage");
	}
}
