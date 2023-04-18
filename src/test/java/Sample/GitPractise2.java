package Sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitPractise2 {
	@Test
	
	public void scriptForGrid() throws MalformedURLException, InterruptedException
	{
		String executeMode="remote";
		WebDriver driver=null;
		if(executeMode.equals("remote"))
		{
			URL url=new URL("http://192.168.225.190:2352/wd/hub");
			DesiredCapabilities cap=new DesiredCapabilities();
			
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
			driver=new RemoteWebDriver(url,cap);
		}
		else if(executeMode.equals("local"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.quit();
	}
}
