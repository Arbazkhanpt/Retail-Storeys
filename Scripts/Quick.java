package retail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Quick {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arbaz\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  Actions action=new Actions(driver);
	  driver.manage().window().maximize();
	  JavascriptExecutor js=( JavascriptExecutor)driver;
	  driver.get("https://www.retailstoreys.com/");
	  
	  WebElement Q1=driver.findElement(By.xpath("//span[@class='corner']"));
	  action.moveToElement(Q1).click().perform();
	 WebElement Q22=driver.findElement(By.id("name"));
     action.moveToElement(Q22).click();	 
	 Q22.sendKeys("Arbaz");
	  
	  WebElement Q3=driver.findElement(By.xpath("//*[@id='phone_number']"));
	  action.moveToElement(Q3).click();
	  Q3.sendKeys("7083976441");
	  
	  WebElement Q4=driver.findElement(By.xpath("//*[@id='email1']"));
	  action.moveToElement(Q4).click();
	  Q4.sendKeys("ak@gmail.com");
	  
	 
	  
  }
}
