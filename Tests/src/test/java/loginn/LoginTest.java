package loginn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.awt.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class LoginTest{
	WebDriver driver;
  @Test(priority=0)
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://opensource.demo.orangehrmlive.com/%C2%A0");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  Thread.sleep(4000);
	  driver.quit();
 }
 
}
