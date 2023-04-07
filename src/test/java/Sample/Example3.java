package Sample;

import org.testng.annotations.Test;

public class Example3 {

	@Test(groups="smoke")
	public void sample12()
	{
		System.out.println("Sample script 12");

	}
    @Test(groups="regression")
	public void sample21()
	{
		System.out.println("Sample script 21");

	}
 
}
