package retail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class contact {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arbaz\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  Actions action=new Actions(driver);
	  driver.manage().window().maximize();
	  JavascriptExecutor js=( JavascriptExecutor)driver;
	  driver.get("https://www.retailstoreys.com/");
	 
	  WebElement C11=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a"));
	  C11.click();
	  WebElement C12=driver.findElement(By.xpath("//*[@id=\"name\"]//following::*[@placeholder='Name']"));
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  C12.click();
	  C12.sendKeys("Arbazkhan");
	  WebElement C13=driver.findElement(By.xpath("//*[@id=\"email1\"]//following::*[@id='email1']"));
	  C13.click();
	  C13.sendKeys("arbazkh@outlook.com");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  WebElement C14=driver.findElement(By.xpath("//*[@id=\"phone_number\"]//following::*[@id='phone_number']"));
	  C14.click();
	  C14.sendKeys("7083976441");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  WebElement C15=driver.findElement(By.xpath("//*[@id=\"message1\"]"));
	  C15.click();
	  C15.sendKeys("Need to know more details about the site");
	  WebElement C16=driver.findElement(By.xpath("//*[@id=\"contact-form\"]/button"));
	
	  action.moveToElement(C16).perform();
	  
  }
}
