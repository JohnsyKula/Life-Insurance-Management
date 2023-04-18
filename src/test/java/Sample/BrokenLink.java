package Sample;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	@Test
	public void brokenLink()
	{
		WebDriverManager.chromedriver().setup();
	}

}
