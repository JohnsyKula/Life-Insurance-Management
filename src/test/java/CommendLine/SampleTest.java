package CommendLine;

import org.testng.annotations.Test;

public class SampleTest {
@Test(groups="smoke")
public void script1()
{
	System.out.println("Example 1");
}
@Test(groups="regression")
public void Script2()
{
	System.out.println("Example 2");
}
}
