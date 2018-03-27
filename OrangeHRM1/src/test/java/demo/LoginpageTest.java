package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginpageTest {
	WebDriver driver;
  @Test(priority=1)
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://opensource.demo.orangehrmlive.com/%C2%A0");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  
  }
}
