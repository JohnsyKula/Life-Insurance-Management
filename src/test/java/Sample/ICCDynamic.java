package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCDynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/");
		//Actions a=new Actions(driver);
		//a.moveToElement(null)
		List<WebElement> data = driver.findElements(By.xpath("//tbody//tr"));
		for(WebElement i:data)
		{
			Thread.sleep(500);
			String text = i.getText();
			System.out.println(text);
		}

	}

}
