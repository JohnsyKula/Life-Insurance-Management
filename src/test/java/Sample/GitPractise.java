package Sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitPractise {
	@Test
	public void gitScript() throws MalformedURLException, InterruptedException
	{
		String executeMode="local";
		WebDriver driver=null;
		if(executeMode.equals("remote"))
		{
			URL url=new URL("http://192.168.0.164:1234/wd/hub");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("chrome");
			driver=new RemoteWebDriver(url,cap);
		}
		else if(executeMode.equals("local"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.quit();
	}

}
