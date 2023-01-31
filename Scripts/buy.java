package retail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class buy {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arbaz\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  Actions action=new Actions(driver);
	  driver.manage().window().maximize();
	  JavascriptExecutor js=( JavascriptExecutor)driver;
	  driver.get("https://www.retailstoreys.com/");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  driver.findElement(By.id("ui-id-2-button")).click();
	  WebElement B1=driver.findElement(By.xpath("//label[text()='Location']//following::span[@class='ui-selectmenu-text']//following::div[@id='ui-id-12'][contains(text(),Kondhwa)]"));
	  driver.findElement(By.id("ui-id-7")).click();
	  
  }
}
