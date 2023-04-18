package MockScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      ChromeOptions option=new ChromeOptions();
      option.addArguments("--disable-notifications");
      WebDriver driver=new ChromeDriver(option);
      driver.get("https://www.redbus.in/");
      driver.findElement(By.id("src")).sendKeys("Bangalore");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//div/input[@id='src']/following::ul[@class='autoFill homeSearch']/li[text()='Madiwala, Bangalore']")).click();
      driver.findElement(By.id("dest")).sendKeys("Chennai");
      driver.findElement(By.xpath("//div/input[@id='dest']/following::li[text()='Koyambedu, Chennai']")).click();
      for(; ;)
      {
    	  String txt=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
    	  if(txt.contains("May"))
    	  {
    	      driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tr[4]/td[5]")).click();
    	      break;
    	  }
    	  else
    	      driver.findElement(By.xpath("//button[text()='>']")).click();  
      }
      WebDriverWait wait=new WebDriverWait(driver, 20);
      wait.until(ExpectedConditions.elementToBeClickable(By.id("search_btn")));
      driver.findElement(By.id("search_btn")).click();
      for(; ;)
      {
      try {
    	  driver.findElement(By.xpath("//div[text()='Northern Travels']"));
    	  break;
      }
      catch(Throwable e)
      {
    	  JavascriptExecutor j=(JavascriptExecutor)driver;
    	  j.executeScript("window.scrollBy(0,1000)");
      }
      }
      String name=driver.findElement(By.xpath("//div[text()='Northern Travels']")).getText();
      String price = driver.findElement(By.xpath("//div[text()='Northern Travels']/parent::div/following-sibling::div//div[@class='fare d-block']")).getText();
      System.out.println(name+"----->"+price);
      driver.close();
	}

}
