package Sample;

import org.testng.annotations.Test;

public class Example1 {

	@Test(groups="smoke")
	public void sample1()
	{
		System.out.println(System.getProperty("browser"));
		System.out.println("Sample script 1");
	}
    @Test(groups="regression")
	public void sample2()
	{
		System.out.println("Sample script 2");

	}
    @Test(groups="smoke")
	public void Sample3()
	{
		System.out.println("hi");
	}
}
