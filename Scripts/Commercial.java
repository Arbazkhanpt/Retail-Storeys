package retail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Commercial {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arbaz\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  Actions action=new Actions(driver);
	  driver.manage().window().maximize();
	  JavascriptExecutor js=( JavascriptExecutor)driver;
	  driver.get("https://www.retailstoreys.com/");
	  
	  WebElement CM1=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
	  CM1.click();
	   
	  WebElement CM2=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[4]/a"));
	  action.moveToElement(CM2).click().build().perform();
  }
}
