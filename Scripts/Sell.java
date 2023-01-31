package retail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sell {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arbaz\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  Actions action=new Actions(driver);
	  driver.manage().window().maximize();
	  JavascriptExecutor js=( JavascriptExecutor)driver;
	  driver.get("https://www.retailstoreys.com/");
	  
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  WebElement E11=driver.findElement(By.xpath("//li[@data-tab=\"#rent\"][contains(text(),'Sell Property')]"));
	  E11.click();
	  WebElement E12=driver.findElement(By.xpath("//label[text()='Your Name']//following::*[@id=\"name\"]"));
	  E12.click();
	  E12.sendKeys("Arbazkhan");
	  
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  WebElement E13=driver.findElement(By.xpath("//label[text()='Your Email']//following::*[@id=\"email\"]"));
	  E13.click();
	  E13.sendKeys("ak@gmail.com");
	  
	  WebElement E14=driver.findElement(By.xpath("//label[text()='Phone Number']//following::*[@id=\"phone\"]"));
	  E14.click();
	  E14.sendKeys("7083976441");
	  
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  WebElement E15=driver.findElement(By.xpath("//label[text()='Your Address']//following::*[@placeholder=\"Address\"]"));
	 E15.click();
	 E15.sendKeys("Karvenagar,Warje Road,Pune");
	 
	 driver.findElement(By.id("type_of_property_id-button")).click();
	  WebElement E16=driver.findElement(By.xpath("(//label[text()='Type of property (1,2,3,4 BHK) '][1]//following::span[@role='combobox']//following::div[text()='2 BHK'])"));
	  E16.sendKeys("2 BHK");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	
	  
	  WebElement E17=driver.findElement(By.xpath("//label[text()='Prperty Location']//following::input[@id='property_location']"));
	  E17.click();
	  E17.sendKeys("Nanded city,Pune");
	
	  
		 
  }
}
