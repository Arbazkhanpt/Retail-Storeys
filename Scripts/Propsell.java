package retail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Propsell {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arbaz\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  Actions action=new Actions(driver);
	  driver.manage().window().maximize();
	  JavascriptExecutor js=( JavascriptExecutor)driver;
	  driver.get("https://www.retailstoreys.com/");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  
	  WebElement PS1=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
	  PS1.click();
	  
	  WebElement PS2=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[2]/a"));
	  PS2.click();
	  
	  WebElement PS3=driver.findElement(By.xpath("//label[text()='Your Name']//following::*[@id=\"name\"]"));
	  PS3.click();
	  PS3.sendKeys("Arbazkhan");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  
	  WebElement PS4=driver.findElement(By.xpath("//label[text()='Your Email']//following::*[@id=\"email\"]"));
	  PS4.click();
	  PS4.sendKeys("ak@gmail.com");
	  
	  WebElement PS5=driver.findElement(By.xpath("//label[text()='Phone Number']//following::*[@id=\"phone\"]"));
	  PS5.click();
	  PS5.sendKeys("7083976441");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  
	  WebElement PS6=driver.findElement(By.xpath("//label[text()='Your Address']//following::*[@placeholder=\"Address\"]"));  
	 PS6.click();
	 PS6.sendKeys("Karvenagar,Warje Road,Pune");
	 
	 driver.findElement(By.id("type_of_property_id-button")).click();
	 
	  WebElement PS7=driver.findElement(By.xpath("(//label[text()='Type of property (1,2,3,4 BHK) '][1]//following::span[@role='combobox']//following::div[text()='2 BHK'])"));
	  PS7.sendKeys("2 BHK");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	
	  
	  WebElement PS8=driver.findElement(By.xpath("//label[text()='Property Location']//following::input[@id='property_location']"));
	  PS8.click();
	  PS8.sendKeys("Nanded city,Pune");
	
  }
}
