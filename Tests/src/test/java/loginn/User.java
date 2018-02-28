package loginn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class User extends Login 
{
	
  @Test(priority=1)
  public void f1() 
  {
	  driver.findElement(By.xpath("//b[text()='Admin']")).click();
	  driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	WebElement seenu=driver.findElement(By.xpath("//select[@id='systemUser_userType']"));
	Select sel=new Select(seenu);
	sel.selectByValue("1");
	  driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("john smith");
	  driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("seenu");
	  driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("123456");
	  
	  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
  }
}
