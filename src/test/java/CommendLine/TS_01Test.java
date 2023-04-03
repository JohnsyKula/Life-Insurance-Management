package CommendLine;

import org.testng.annotations.Test;

public class TS_01Test {
	@Test(groups="smoke")
	public void script1()
	{
		System.out.println("This is my 1 script");
	}
	
	@Test(groups="regression")
	public void script2()
	{
		System.out.println("This is my 2 script");
	}
	
	
	@Test(groups="smoke")
	public void script3()
	{
		System.out.println("This is my 3 script");
	}

}
