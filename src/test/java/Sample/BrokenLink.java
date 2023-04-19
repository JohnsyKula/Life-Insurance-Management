package Sample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		List<WebElement> al=new ArrayList<WebElement>();
		for(WebElement i:allLinks)
		{
                String link = i.getAttribute("href");
                if(link!=null && (!(link.contains("javascript"))))
                {
                  al.add(i);	
                }
		}
		int bcount=0;
		for(WebElement i:al)
		{
			    String link=i.getAttribute("href");
				URL url=new URL(link);
				URLConnection urlCon = url.openConnection();
			    HttpURLConnection httpcon = (HttpURLConnection)urlCon;
			    Thread.sleep(2000);
               // httpcon.connect();
                int response=httpcon.getResponseCode();
                String resMessage=httpcon.getResponseMessage();
                if(response>=400)
                {
                	System.out.println(link+"----->"+response+"-->"+resMessage);
                	bcount++;
                }
                else
                {
                	//System.out.println(link+"------>"+"validlink");
                }
                
		}
		System.out.println("Broken link count "+bcount);
        driver.close();
	}

}

