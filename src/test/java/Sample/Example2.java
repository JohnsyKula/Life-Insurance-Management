package Sample;

import org.testng.annotations.Test;

public class Example2 {
	@Test(groups="smoke")
	public static void script3() {
		System.out.println("Script 3");

	}
	
	@Test(groups="regression")
	public static void script4() {
		System.out.println("Script 3");
	}
}
