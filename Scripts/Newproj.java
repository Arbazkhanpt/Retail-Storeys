package retail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Newproj {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arbaz\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  Actions action=new Actions(driver);
	  driver.manage().window().maximize();
	  JavascriptExecutor js=( JavascriptExecutor)driver;
	  driver.get("https://www.retailstoreys.com/");
	  WebElement N1=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
	  action.moveToElement(N1).click().perform();
	  WebElement NP2=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[3]/a"));
     action.moveToElement(NP2).click().perform();
     
     WebElement Np3=driver.findElement(By.xpath("//button[@class='btn btn-info btn-lg']"));
     Np3.click();
     
     WebElement NP4=driver.findElement(By.xpath("//*[@id='name']//following::*[@placeholder='Name']"));
     action.moveToElement(NP4).click();
     NP4.sendKeys("Arbaz");
     
     WebElement NP5=driver.findElement(By.xpath("//*[@id=\"pname\"]"));
     NP5.click();
     NP5.sendKeys("Resort");
     
     WebElement NP6=driver.findElement(By.xpath("//*[@id=\"email1\"]//following::*[@placeholder='Email']"));
     NP6.click();
     NP6.sendKeys("ak.gmail.com");
     
     WebElement NP7=driver.findElement(By.xpath("//*[@id=\"phone_number\"]//following::*[@placeholder='Phone']"));
     NP7.click();
     NP7.sendKeys("7083976441");
     
     WebElement NC=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
     action.moveToElement(NC).perform();
     
     WebElement CL=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
     CL.click();
     
   
	  
	
	  
	  
  }
}