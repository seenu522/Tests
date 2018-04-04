package Programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	 @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.crmpro.com/index.html");
	  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("tejcharan");
	  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("wexos123");
	  driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	  	  
  }
  
  
  
}
