package retail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Propbuyresale {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arbaz\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver=new ChromeDriver();
	  Actions action=new Actions(driver);
	  driver.manage().window().maximize();
	  JavascriptExecutor js=( JavascriptExecutor)driver;
	  driver.get("https://www.retailstoreys.com/");
	
	  WebElement P1=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
	  action.moveToElement(P1).click().perform();
	  
	  WebElement P2=driver.findElement(By.xpath("//button[@class='navbar-toggler']//following::*[@class='dropdown']//following::a[contains(text(),Properties)]//following::a[text()='Buy Resale Property'][contains(@href,\"/properties\")]"));
	  action.moveToElement(P2).click().perform();
	  
	  WebElement P3=driver.findElement(By.xpath("//div[@class='col-md-6']//following::button[text()=' Click Here To Enquire about Home Loans']"));
	  P3.click();
	  
	WebElement P4=driver.findElement(By.xpath("//div[@class='form-group']//following::*[@placeholder='Name']//following::*[@id='name']"));
	action.moveToElement(P4).click();
	P4.sendKeys("Arbaz");
	  
	  WebElement P5=driver.findElement(By.xpath("//div[@class='form-group']//following::*[@id='email1']//following::*[@placeholder='Email']"));
	  P5.click();
	  P5.sendKeys("arbaz@gmail.com");
	  WebElement P6=driver.findElement(By.xpath("//div[@class='form-group']//following::*[@id='phone_number']//following::*[@placeholder='Phone']"));
	  P6.click();
	  P6.sendKeys("7083976441");
	  WebElement P7=driver.findElement(By.xpath("//button[contains(text(),Close)]//following::*[@class='btn btn-default']"));
	  P7.click();
	  
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
	  
	  WebElement EC1=driver.findElement(By.xpath("//button[text()='Emi Calculator']"));
	  EC1.click();
  }
}

